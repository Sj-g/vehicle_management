package com.it.vehicle.mapper;

import com.it.vehicle.entity.Transport;
import com.it.vehicle.entity.TransportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransportMapper {
    long countByExample(TransportExample example);

    int deleteByExample(TransportExample example);

    int deleteByPrimaryKey(Integer transportId);

    int insert(Transport record);

    int insertSelective(Transport record);

    List<Transport> selectByExample(TransportExample example);

    Transport selectByPrimaryKey(Integer transportId);

    int updateByExampleSelective(@Param("record") Transport record, @Param("example") TransportExample example);

    int updateByExample(@Param("record") Transport record, @Param("example") TransportExample example);

    int updateByPrimaryKeySelective(Transport record);

    int updateByPrimaryKey(Transport record);
}