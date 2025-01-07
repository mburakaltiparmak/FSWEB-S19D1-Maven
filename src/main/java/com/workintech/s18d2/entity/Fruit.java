package com.workintech.s18d2.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "fruit",schema = "fsweb")
public class Fruit extends Plant {

    @Column(name = "fruit_type")
    @Enumerated(value = EnumType.STRING)
    @NotNull(message = "Fruit Type field cannot be null")
    private FruitType fruitType;

}
