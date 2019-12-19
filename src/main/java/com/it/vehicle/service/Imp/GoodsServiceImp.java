package com.it.vehicle.service.Imp;

import com.it.vehicle.dto.EntityStatus;
import com.it.vehicle.entity.GoodsOrder;
import com.it.vehicle.entity.GoodsOrderExample;
import com.it.vehicle.mapper.GoodsOrderMapper;
import com.it.vehicle.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoodsServiceImp implements GoodsService {
    private final GoodsOrderMapper goodsOrderMapper;

    @Autowired
    public GoodsServiceImp(GoodsOrderMapper goodsOrderMapper) {
        this.goodsOrderMapper = goodsOrderMapper;
    }

    @Override
    public void addGoodsOrder(GoodsOrder goodsOrder) {
        goodsOrderMapper.insertSelective(goodsOrder);
    }

    @Override
    public void deleteGoodsOrder(Integer goodsOrderId) {
        goodsOrderMapper.deleteByPrimaryKey(goodsOrderId);
    }

    @Override
    public void batchDeleteGoodsOrder(List<Integer> goodsOrderId) {
        GoodsOrderExample example = new GoodsOrderExample();
        GoodsOrderExample.Criteria criteria = example.createCriteria();
        criteria.andOrderIdIn(goodsOrderId);
        goodsOrderMapper.deleteByExample(example);
    }

    @Override
    public void updateGoodsOrder(GoodsOrder goodsOrder) {
        goodsOrderMapper.updateByPrimaryKeySelective(goodsOrder);
    }

    @Override
    public List<GoodsOrder> selectAllGoodsOrder() {
        GoodsOrderExample orderExample = new GoodsOrderExample();
        GoodsOrderExample.Criteria criteria = orderExample.createCriteria();
        List<Integer> list = new ArrayList<>();
        list.add(EntityStatus.GOODS_EXCEPTION.getCode());
        list.add(EntityStatus.GOODS_ORDER_FREE.getCode());
        list.add(EntityStatus.GOODS_ORDER_IN_THE_TRANSPORT.getCode());
        list.add(EntityStatus.GOODS_ORDER_RECEIPT.getCode());
        criteria.andOrderStatusIn(list);
        return goodsOrderMapper.selectByExample(orderExample);
    }

    @Override
    public GoodsOrder selectGoodsOrderById(Integer goodsOrderId) {
        return goodsOrderMapper.selectByPrimaryKey(goodsOrderId);
    }

    @Override
    public Long getOrderCount() {
        GoodsOrderExample goodsOrderExample = new GoodsOrderExample();
        return goodsOrderMapper.countByExample(goodsOrderExample);
    }

    @Override
    public List<GoodsOrder> selectGoodsOrderByTransportId(Integer transportId) {
        GoodsOrderExample goodsOrderExample = new GoodsOrderExample();
        GoodsOrderExample.Criteria criteria = goodsOrderExample.createCriteria();
        criteria.andTransportIdEqualTo(transportId);
        return goodsOrderMapper.selectByExample(goodsOrderExample);
    }
}
