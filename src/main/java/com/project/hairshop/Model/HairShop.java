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
@Table(name = "hairshop")
public class HairShop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hairshop_seq")
    private int hairShopSeq;

    @Column(name = "hairshop_addr")
    private String hairShopAddr;
    @Column(name = "hairshop_num")
    private String hairShopNum;
    @Column(name = "hairshop_name")
    private String hairShopName;
    @Column(name = "hairshop_breakday")
    private String hairShopBreakDay;
    @Column(name = "open")
    private Time open;
    @Column(name = "closed")
    private Time closed;

    @Builder
    public HairShop(int hairShopSeq, String hairShopAddr, String hairShopNum, String hairShopName,
                    String hairShopBreakDay, Time open, Time closed) {
        this.hairShopSeq = hairShopSeq;
        this.hairShopAddr = hairShopAddr;
        this.hairShopNum = hairShopNum;
        this.hairShopName = hairShopName;
        this.hairShopBreakDay = hairShopBreakDay;
        this.open = open;
        this.closed = closed;
    }
}
