package com.project.hairshop.Model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "client")
public class Client {

    @Id
    @Column(name = "client_id")
    private String clientId;

    @ManyToOne(fetch = FetchType.LAZY) // 지연로딩
    @JoinColumn(name = "client_grade", nullable = false)    // 외래키 컬럼명
    private ClientGrade clientGrade;

    @Column(name = "client_pwd")
    private String clientPwd;
    @Column(name = "client_name")
    private String clientName;
    @Column(name = "client_phonenum")
    private String clientPhoneNum;
    @Column(name = "client_gender")
    private int clientGender;
    @Column(name = "client_birth")
    private Date clientBirth;
    @Column(name = "client_reservecount")
    private int clientReserveCount;
    @Column(name = "client_totalfee")
    private int clientTotalFee;

    @Builder
    public Client(String clientId, ClientGrade clientGrade, String clientPwd, String clientName, String clientPhoneNum,
                  int clientGender, Date clientBirth, int clientReserveCount, int clientTotalFee) {
        this.clientId = clientId;
        this.clientGrade = clientGrade;
        this.clientPwd = clientPwd;
        this.clientName = clientName;
        this.clientPhoneNum = clientPhoneNum;
        this.clientGender = clientGender;
        this.clientBirth = clientBirth;
        this.clientReserveCount = clientReserveCount;
        this.clientTotalFee = clientTotalFee;
    }
}
