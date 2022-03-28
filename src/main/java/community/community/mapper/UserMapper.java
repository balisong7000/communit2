package community.community.mapper;


import community.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import javax.servlet.http.Cookie;


@Mapper
public interface UserMapper {
    @Insert("insert into user  ( name,accountId,token,gmtcreate,gmtmodified,avatarUrl) values ( #{name},#{accountId},#{token},#{gmtCreate},#{gmtModified},#{avatarUrl)")
     void insertUser(User user);
    @Select("select * from user where token=#{token}")
    User findByCookie(@Param("token")  String token);
}
