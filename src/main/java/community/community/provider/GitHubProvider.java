package community.community.provider;

import com.alibaba.fastjson.JSON;
import community.community.dao.AccessTokenDTO;
import community.community.dao.GitHubUser;
import okhttp3.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class GitHubProvider {
    public String gitAccessToken(AccessTokenDTO accessTokenDTO) {
        MediaType mediaType  = MediaType.get("application/json; charset=utf-8");
        OkHttpClient client = new OkHttpClient();
        String url = "https://github.com/login/oauth/access_token";
        RequestBody body = RequestBody.create(mediaType, JSON.toJSONString(accessTokenDTO));
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            String res_body=response.body().string();;
            String [] split=res_body.split("&");
            String tokenStr=split[0];
            String token=tokenStr.split("=")[1];
            System.out.println("-------------------"+token);
            return token;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public GitHubUser getUser(String accessToken)
    {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.github.com/user")
                .header("Authorization","token "+accessToken)
                .build();

        try (Response response = client.newCall(request).execute()) {
            String res_body=response.body().string();;
            GitHubUser gitHubuser = JSON.parseObject(res_body, GitHubUser.class);
            return gitHubuser;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
