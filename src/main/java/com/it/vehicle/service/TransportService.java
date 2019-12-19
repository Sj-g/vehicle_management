package com.it.vehicle.service;

import com.it.vehicle.entity.Transport;

import java.util.List;

public interface TransportService {
    /**
     * 定时任务当每天的00：00时根据订单生成运输单
     * 算法从数据库获取数据，形成路径 订单 车辆 重量
     */
    void addTransport();

    void deleteTransport(Integer transportId);

    void batchDeleteTransport(List<Integer> transportIds);

    void updateTransport(Transport transport);


    List<Transport> selectAllTransport();

    Transport selectTransportById(Integer transportId);

    Transport getTransport(Integer driverId);

    List<String> getThePath(Integer transportId);

    Transport getTransportById(Integer transportId);
}
