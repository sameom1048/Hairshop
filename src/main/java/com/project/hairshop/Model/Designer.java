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
@Table(name = "designer")
public class Designer {

    @Id
    @Column(name = "designer_seq")
    private int designerSeq;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hairshop_seq", nullable = false)
    private HairShop hairShopSeq;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "job_class", nullable = false)
    private DesignerClass jobClass;

    @Column(name = "designer_name")
    private String designerName;
    @Column(name = "designer_gender")
    private int designerGender;
    @Column(name = "designer_age")
    private int designerAge;
    @Column(name = "ability")
    private String ability;

    @Builder
    public Designer(int designerSeq, HairShop hairShopSeq, DesignerClass jobClass, String designerName, int designerGender,
                    int designerAge, String ability) {
        this.designerSeq = designerSeq;
        this.hairShopSeq = hairShopSeq;
        this.jobClass = jobClass;
        this.designerName = designerName;
        this.designerGender = designerGender;
        this.designerAge = designerAge;
        this.ability = ability;
    }
}
