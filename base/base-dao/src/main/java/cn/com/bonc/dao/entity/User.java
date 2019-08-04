package cn.com.bonc.dao.entity;
/**
 * @author greatDistance
 * @version 1.0
 * @ClassName User
 * @description TODO
 * @date 2019/8/4 11:38
 */
public class User {
    private Integer id;

    private String username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}