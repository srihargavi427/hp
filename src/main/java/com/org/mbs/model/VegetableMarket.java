package com.org.mbs.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="spencer")
@Data
public class VegetableMarket {
    @Id
    private int marketId;
    private String marketPlace;
    private String marketWing;
    private double marketIncome;
}
