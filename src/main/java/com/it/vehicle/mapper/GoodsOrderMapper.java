package com.it.vehicle.mapper;

import com.it.vehicle.entity.GoodsOrder;
import com.it.vehicle.entity.GoodsOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsOrderMapper {
    long countByExample(GoodsOrderExample example);

    int deleteByExample(GoodsOrderExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(GoodsOrder record);

    int insertSelective(GoodsOrder record);

    List<GoodsOrder> selectByExample(GoodsOrderExample example);

    GoodsOrder selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") GoodsOrder record, @Param("example") GoodsOrderExample example);

    int updateByExample(@Param("record") GoodsOrder record, @Param("example") GoodsOrderExample example);

    int updateByPrimaryKeySelective(GoodsOrder record);

    int updateByPrimaryKey(GoodsOrder record);
}