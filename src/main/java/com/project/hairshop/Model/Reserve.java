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
@Table(name = "reserve")
public class Reserve {

    @Id
    @Column(name = "reserve_seq")
    private int reserveSeq;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id", nullable = false)
    private Client clientId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hairshop_seq", nullable = false)
    private HairShop productName;

    @Column(name = "reserve_fee")
    private int reserveFee;

    @Builder
    public Reserve(int reserveSeq, Client clientId, HairShop productName, int reserveFee) {
        this.clientId = clientId;
        this.reserveSeq = reserveSeq;
        this.productName = productName;
        this.reserveFee = reserveFee;
    }
}
