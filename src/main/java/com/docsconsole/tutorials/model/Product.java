package com.docsconsole.tutorials.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;



@Entity
@Table(name = "product",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "product_id")
        })
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long product_id;

    @NotBlank
    @Size(max = 20)
    private String productName;


}
