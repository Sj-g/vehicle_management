package com.it.vehicle.service.Imp;

import com.it.vehicle.dto.EntityStatus;
import com.it.vehicle.entity.Truck;
import com.it.vehicle.entity.TruckExample;
import com.it.vehicle.mapper.TruckMapper;
import com.it.vehicle.service.TruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TruckServiceImp implements TruckService {
    private final TruckMapper truckMapper;
    @Autowired
    public TruckServiceImp(TruckMapper truckMapper) {
        this.truckMapper = truckMapper;
    }

    @Override
    public void addTruck(Truck truck) {
        truckMapper.insertSelective(truck);
    }

    @Override
    public void deleteTruckById(Integer truckId) {
        truckMapper.deleteByPrimaryKey(truckId);
    }

    @Override
    public void batchDeleteTruck(List<Integer> truckIds) {
        TruckExample truckExample=new TruckExample();
        TruckExample.Criteria criteria = truckExample.createCriteria();
        criteria.andTruckIdIn(truckIds);
        truckMapper.deleteByExample(truckExample);
    }

    @Override
    public void updateTruck(Truck truck) {
            truckMapper.updateByPrimaryKeySelective(truck);
    }

    @Override
    public List<Truck> selectAll() {
        TruckExample truckExample=new TruckExample();
        TruckExample.Criteria criteria = truckExample.createCriteria();
        List<Integer> integers = new ArrayList<>();
        integers.add(EntityStatus.TRUCK_FREE.getCode());
        integers.add(EntityStatus.TRUCK_IN_THE_TRANSPORT.getCode());
        integers.add(EntityStatus.TRUCK_MAINTAIN.getCode());
        integers.add(EntityStatus.TRUCK_SCRAP.getCode());
        criteria.andTruckStatusIn(integers);
        return truckMapper.selectByExample(truckExample);
    }

    @Override
    public Truck selectTruckById(Integer truckId) {
        return truckMapper.selectByPrimaryKey(truckId);
    }

    @Override
    public Truck selectTruckByTransportId(Integer transportId) {
        TruckExample truckExample=new TruckExample();
        TruckExample.Criteria criteria = truckExample.createCriteria();
        criteria.andTruckTransportIdEqualTo(transportId);
        return truckMapper.selectByExample(truckExample).get(0);
    }
}
