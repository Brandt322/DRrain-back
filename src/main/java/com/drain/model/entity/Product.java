package com.drain.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, unique = true)
    private Long id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Height")
    private double height;
    @Column(name = "Width")
    private double width;
    @Column(name = "Color")
    private String color;
    @Column(name = "PdtDescription")
    private String pdtDescription;
    @Column(name = "QtyInStock")
    private int qtyInStock;
    @Column(name = "BuyPrice")
    private double buyPrice;
    @Column(name = "Discount")
    private double discount;
    @ManyToMany()
    private Brand brandID;
    @Column(name = "ProductType")
    private String productType;
}
