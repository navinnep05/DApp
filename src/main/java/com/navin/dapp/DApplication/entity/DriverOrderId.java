package com.navin.dapp.DApplication.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class DriverOrderId implements Serializable {

    private Integer driverId;
    private Integer orderId;
}
