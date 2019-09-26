package model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

//import javax.persistence.Entity;
//import javax.persistence.Id;
@Component
@Entity
@Table(name = "pro")
public class Product {
    @Id
   @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String desc;

    public Product() {
    }

    public Product(String name, String desc) {
        this.setName(name);
        this.setDesc(desc);

    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "id : "+ getId() +" name: "+name+" description: "+desc;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
