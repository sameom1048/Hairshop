package com.project.hairshop.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "designer_class")
public class DesignerClass {

    @Id
    @Column(name = "job_class")
    private String jobClass;

    @Column(name = "additional_fee")
    private int additionalFee;

    @Builder
    public DesignerClass(String jobClass, int additionalFee) {
        this.jobClass = jobClass;
        this.additionalFee = additionalFee;
    }
}
