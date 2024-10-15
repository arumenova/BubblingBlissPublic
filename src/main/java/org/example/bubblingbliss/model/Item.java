package org.example.bubblingbliss.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Inventory")


public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String name;
    private String flavor;
    private Integer stock;
    private double price;

    public Item(String name, String flavor, Integer stock, double price) {
        this.name = name;
        this.flavor = flavor;
        this.stock = stock;
        this.price = price;
    }
}

