package com.project.hairshop.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "client_grade")
public class ClientGrade {

    @Id
    @Column(name = "client_grade")
    private String clientGrade;

    @Column(name = "discount_rate")
    private int discountRate;

    @Builder
    public ClientGrade(String clientGrade, int discountRate) {
        this.clientGrade = clientGrade;
        this.discountRate = discountRate;
    }
}
