package com.it.vehicle.mapper;

import com.it.vehicle.entity.Truck;
import com.it.vehicle.entity.TruckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TruckMapper {
    long countByExample(TruckExample example);

    int deleteByExample(TruckExample example);

    int deleteByPrimaryKey(Integer truckId);

    int insert(Truck record);

    int insertSelective(Truck record);

    List<Truck> selectByExample(TruckExample example);

    Truck selectByPrimaryKey(Integer truckId);

    int updateByExampleSelective(@Param("record") Truck record, @Param("example") TruckExample example);

    int updateByExample(@Param("record") Truck record, @Param("example") TruckExample example);

    int updateByPrimaryKeySelective(Truck record);

    int updateByPrimaryKey(Truck record);
}