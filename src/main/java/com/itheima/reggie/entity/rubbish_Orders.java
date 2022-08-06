package com.itheima.reggie.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigInteger;

/**
 * @author bz_c
 * @version 1.0
 */
@Data
public class rubbish_Orders implements Serializable {
    private BigInteger id;

    private String number;

    private int status;

    private BigInteger userId;

    private String userName;

    private String orderTime;

    private String overTime;

    private String remark;

    private String driverPhone;

    private String userPhone;

    private String startAddress;

    private String destination;

    private String longitude;

    private String latitude;
}
