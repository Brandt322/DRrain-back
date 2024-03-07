package com.drain.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CheckNum")
    private String checkNum;
    @Column(name = "PaymentDate")
    private Date paymentDate ;
    @Column(name = "Amount")
    private double amount;
    @ManyToOne
    @JoinColumn(name = "CustomerID")
    private Customer customer;


}
