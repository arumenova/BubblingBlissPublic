package org.example.bubblingbliss.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;


@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "inventory")


public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String name;
    private String flavor;
    private Integer stock;
    private BigDecimal price;

    public Item(String name, String flavor, Integer stock, BigDecimal price) {
        this.name = name;
        this.flavor = flavor;
        this.stock = stock;
        this.price = price;
    }
}

