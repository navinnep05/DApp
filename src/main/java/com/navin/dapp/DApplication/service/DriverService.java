package com.navin.dapp.DApplication.service;

import com.navin.dapp.DApplication.Repo.DriverDetailRepository;
import com.navin.dapp.DApplication.entity.DriverDetailEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService {

    @Autowired
    DriverDetailRepository driverDetailRepository;


    public List<DriverDetailEntity> allUserList() {
        List<DriverDetailEntity> driverList = driverDetailRepository.findAll();
        return driverList;
    }
}
