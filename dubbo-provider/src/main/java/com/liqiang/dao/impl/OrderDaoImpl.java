package com.liqiang.dao.impl;

import com.liqiang.dao.OrderDao;
import org.springframework.stereotype.Service;

@Service
public class OrderDaoImpl implements OrderDao {
    @Override
    public String getDetail(String id) {

        return "订单金额500元";
    }
}
