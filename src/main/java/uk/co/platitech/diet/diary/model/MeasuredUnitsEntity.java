package uk.co.platitech.diet.diary.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by bond on 18/10/15.
 */
@Entity
@Table(name = "measured_units", schema = "", catalog = "diet_diary")
public class MeasuredUnitsEntity {
    private int id;
    private Date dateMesaured;
    private float mesauredValue;
    private String foodEaten;
    private int testType;
    private TestTypesEntity testTypesByTestType;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "date_mesaured")
    public Date getDateMesaured() {
        return dateMesaured;
    }

    public void setDateMesaured(Date dateMesaured) {
        this.dateMesaured = dateMesaured;
    }

    @Basic
    @Column(name = "mesaured_value")
    public float getMesauredValue() {
        return mesauredValue;
    }

    public void setMesauredValue(float mesauredValue) {
        this.mesauredValue = mesauredValue;
    }

    @Basic
    @Column(name = "food_eaten")
    public String getFoodEaten() {
        return foodEaten;
    }

    public void setFoodEaten(String foodEaten) {
        this.foodEaten = foodEaten;
    }

    @Basic
    @Column(name = "test_type")
    public int getTestType() {
        return testType;
    }

    public void setTestType(int testType) {
        this.testType = testType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MeasuredUnitsEntity that = (MeasuredUnitsEntity) o;

        if (id != that.id) return false;
        if (Float.compare(that.mesauredValue, mesauredValue) != 0) return false;
        if (testType != that.testType) return false;
        if (dateMesaured != null ? !dateMesaured.equals(that.dateMesaured) : that.dateMesaured != null) return false;
        if (foodEaten != null ? !foodEaten.equals(that.foodEaten) : that.foodEaten != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (dateMesaured != null ? dateMesaured.hashCode() : 0);
        result = 31 * result + (mesauredValue != +0.0f ? Float.floatToIntBits(mesauredValue) : 0);
        result = 31 * result + (foodEaten != null ? foodEaten.hashCode() : 0);
        result = 31 * result + testType;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "test_type", referencedColumnName = "id", nullable = false)
    public TestTypesEntity getTestTypesByTestType() {
        return testTypesByTestType;
    }

    public void setTestTypesByTestType(TestTypesEntity testTypesByTestType) {
        this.testTypesByTestType = testTypesByTestType;
    }
}
