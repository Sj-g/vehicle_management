package com.it.vehicle.mapper;

import com.it.vehicle.entity.TestEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {

     TestEntity testEntity();
}
