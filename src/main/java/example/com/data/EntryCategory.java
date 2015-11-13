package example.com.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EntryCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;

    protected EntryCategory(){}

    public EntryCategory(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
