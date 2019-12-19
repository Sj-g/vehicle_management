package com.it.vehicle.service.Imp;

import com.it.vehicle.dto.EntityStatus;
import com.it.vehicle.entity.Signing;
import com.it.vehicle.entity.SigningExample;
import com.it.vehicle.entity.Transport;
import com.it.vehicle.mapper.SigningMapper;
import com.it.vehicle.mapper.TransportMapper;
import com.it.vehicle.service.SigningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SigningServiceImp implements SigningService {
    private final SigningMapper signingMapper;
    private final TransportMapper transportMapper;
    @Autowired
    public SigningServiceImp(SigningMapper signingMapper, TransportMapper transportMapper) {
        this.signingMapper = signingMapper;
        this.transportMapper = transportMapper;
    }

    @Override
    public List<Signing> selectSigning() {
        SigningExample signingExample=new SigningExample();
        SigningExample.Criteria criteria = signingExample.createCriteria();
        List<Integer> integerList=new ArrayList<>();
        integerList.add(EntityStatus.SIGNING_EXCEPTION.getCode());
        integerList.add(EntityStatus.SIGNING_NORMAL.getCode());
        criteria.andSigningStatusIn(integerList);
        return signingMapper.selectByExample(signingExample);
    }

    @Override
    public void addSigning(Signing signing) {
        signingMapper.insert(signing);
    }
}
