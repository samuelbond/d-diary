package example.com.data;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Entry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String user;
    private EntryCategory category;
    private float measurement;
    private Date date;
    private String meal;
    private String comment;

    protected Entry() {
    }

    public Entry(String user, EntryCategory category, float measurement, Date date, String meal, String comment) {
        this.user = user;
        this.category = category;
        this.measurement = measurement;
        this.date = date;
        this.meal = meal;
        this.comment = comment;
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

    public EntryCategory getCategory() {
        return category;
    }

    public void setCategory(EntryCategory category) {
        this.category = category;
    }

    public float getMeasurement() {
        return measurement;
    }

    public void setMeasurement(float measurement) {
        this.measurement = measurement;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
