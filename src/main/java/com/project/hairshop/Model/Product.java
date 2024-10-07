package com.project.hairshop.Model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@IdClass(ProductCompositeKey.class)
@Table(name = "product")
public class Product {

    @Id
    @Column(name = "product_name")
    private String productName;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hairshop_seq", nullable = false)
    private HairShop hairShopSeq;

    @Column(name = "product_category")
    private String productCategory;
    @Column(name = "product_customname")
    private String productCustomName;
    @Column(name = "product_time")
    private int productTime;
    @Column(name = "product_fee")
    private int productFee;

    @Builder
    public Product(HairShop hairShopSeq, String productName, String productCategory, String productCustomName,
                   int productTime, int productFee) {
        this.hairShopSeq = hairShopSeq;
        this.productName = productName;
        this.productCategory = productCategory;
        this.productCustomName = productCustomName;
        this.productTime = productTime;
        this.productFee = productFee;
    }
}
