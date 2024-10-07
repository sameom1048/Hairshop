package com.project.hairshop.Model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "option")
public class Option {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "option_seq")
    private int optionSeq;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hairshop_seq", nullable = false)
    private Product hairShopSeq;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_name", nullable = false)
    private Product productName;

    @Column(name = "option_name")
    private String optionName;
    @Column(name = "option_fee")
    private int optionFee;

    @Builder
    public Option(int optionSeq, Product hairShopSeq, Product productName, String optionName, int optionFee) {
        this.hairShopSeq = hairShopSeq;
        this.optionSeq = optionSeq;
        this.productName = productName;
        this.optionName = optionName;
        this.optionFee = optionFee;
    }
}
