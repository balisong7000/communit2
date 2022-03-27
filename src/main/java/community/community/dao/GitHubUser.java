package community.community.dao;

public class GitHubUser {
    private String  name;
    private long id;
    private  String bao;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBao() {
        return bao;
    }

    public void setBao(String bao) {
        this.bao = bao;
    }

    @Override
    public String toString() {
        return "GitHubuser{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", bao='" + bao + '\'' +
                '}';
    }
}
