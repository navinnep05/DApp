package com.navin.dapp.DApplication.controller;


import com.navin.dapp.DApplication.entity.DriverDetailEntity;
import com.navin.dapp.DApplication.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/driver/user")
public class DriverController {

    @Autowired
    DriverService driverService;

    @GetMapping("/userList")
    public List<DriverDetailEntity> allUserList()
    {
       return driverService.allUserList();
    }
}
