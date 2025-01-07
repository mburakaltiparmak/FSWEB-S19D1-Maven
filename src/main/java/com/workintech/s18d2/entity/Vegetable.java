package com.workintech.s18d2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "vegetable",schema = "fsweb")
public class Vegetable extends Plant {
    @Column(name = "is_grown_on_tree")
    private Boolean isGrownOnTree;
}
