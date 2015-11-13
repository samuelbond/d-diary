package example.com.data;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Setting {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String user;
    private String name;
    private String setting;

    protected Setting(){}

    public Setting(String user, String name, String setting) {
        this.user = user;
        this.name = name;
        this.setting = setting;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSetting() {
        return setting;
    }

    public void setSetting(String setting) {
        this.setting = setting;
    }
}
