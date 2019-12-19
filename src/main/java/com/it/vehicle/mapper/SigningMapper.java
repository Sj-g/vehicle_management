package com.it.vehicle.mapper;

import com.it.vehicle.entity.Signing;
import com.it.vehicle.entity.SigningExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SigningMapper {
    long countByExample(SigningExample example);

    int deleteByExample(SigningExample example);

    int deleteByPrimaryKey(Integer signingId);

    int insert(Signing record);

    int insertSelective(Signing record);

    List<Signing> selectByExample(SigningExample example);

    Signing selectByPrimaryKey(Integer signingId);

    int updateByExampleSelective(@Param("record") Signing record, @Param("example") SigningExample example);

    int updateByExample(@Param("record") Signing record, @Param("example") SigningExample example);

    int updateByPrimaryKeySelective(Signing record);

    int updateByPrimaryKey(Signing record);
}