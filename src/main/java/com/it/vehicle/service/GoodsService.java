package com.it.vehicle.service;

import com.it.vehicle.entity.GoodsOrder;

import java.util.List;

public interface GoodsService {
    void addGoodsOrder(GoodsOrder goodsOrder);

    void deleteGoodsOrder(Integer goodsOrderId);

    void batchDeleteGoodsOrder(List<Integer> goodsOrderId);

    void updateGoodsOrder(GoodsOrder goodsOrder);

    List<GoodsOrder> selectAllGoodsOrder();

    GoodsOrder selectGoodsOrderById(Integer goodsOrderId);

    Long getOrderCount();

    List<GoodsOrder> selectGoodsOrderByTransportId(Integer transportId);
}
