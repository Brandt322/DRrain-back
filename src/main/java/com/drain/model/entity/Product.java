package com.drain.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, unique = true)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "height")
    private double height;
    @Column(name = "width")
    private double width;
    @Column(name = "color")
    private String color;
    @Column(name = "pdt_description")
    private String pdtDescription;
    @Column(name = "qty_in_Stock")
    private int qtyInStock;
    @Column(name = "buy_price")
    private double buyPrice;
    @Column(name = "discount")
    private double discount;
    @ManyToOne
    @JoinColumn(name = "brand_id", referencedColumnName = "id", nullable = false)
    private Brand brand;
    @Column(name = "product_type")
    private String productType;
}
