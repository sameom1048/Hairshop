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
@IdClass(RatingCompositeKey.class)
@Table(name = "rating")
public class Rating {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reserve_seq", nullable = false)
    private Reserve reserveSeq;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "designer_seq", nullable = false)
    private Designer designerSeq;

    @Column(name = "grade_kind")
    private int gradeKind;
    @Column(name = "grade_ability")
    private int gradeAbility;
    @Column(name = "grade_satisfaction")
    private int gradeSatisfaction;


    @Builder
    public Rating(Reserve reserveSeq, Designer designerSeq, int gradeKind, int gradeAbility, int gradeSatisfaction) {
        this.designerSeq = designerSeq;
        this.reserveSeq = reserveSeq;
        this.gradeKind = gradeKind;
        this.gradeAbility = gradeAbility;
        this.gradeSatisfaction = gradeSatisfaction;
    }
}
