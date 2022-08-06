package com.itheima.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.reggie.entity.rubbish_Orders;
import com.itheima.reggie.mapper.rubbish_OrderMaper;
import com.itheima.reggie.service.rubbish_OrderService;
import org.springframework.stereotype.Service;

/**
 * @author bz_c
 * @version 1.0
 */
@Service
public class rubbish_orderServiceImpl extends ServiceImpl<rubbish_OrderMaper, rubbish_Orders> implements rubbish_OrderService {
}
