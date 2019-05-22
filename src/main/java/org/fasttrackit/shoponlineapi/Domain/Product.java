package org.fasttrackit.shoponlineapi.Domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
//class is a tabel in database with @Entity
public class Product {

    @Id
    //id is primary key in "Product" table
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //for AUTO_INCREMENT at Default(Predefint) column
    private long id;

    @NotNull
    //field ca not be null
    @Size(min = 1,max=300)
    private String name;
    private String sku;
    private double price;
    private int quantity;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
