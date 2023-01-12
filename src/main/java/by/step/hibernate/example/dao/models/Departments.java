package by.step.hibernate.example.dao.models;

import javax.persistence.*;

@Entity
public class Departments {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Column(name = "Financing")
    private double financing;
    @Column(name = "Name")
    private String name;

    public Departments () { }

    public Departments(int id,  double financing, String name) {
        this.id = id;
        this.financing = financing;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getFinancing() {
        return financing;
    }

    public void setFinancing(double financing) {
        this.financing = financing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Departments{" +
                "id=" + id +
                ", financing=" + financing +
                ", name='" + name + '\'' +
                '}';
    }
}
