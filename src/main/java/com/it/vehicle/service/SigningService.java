package com.it.vehicle.service;

import com.it.vehicle.entity.Signing;

import java.util.List;

public interface SigningService {
    List<Signing> selectSigning();

    void addSigning(Signing signing);
}
