package com.navin.dapp.DApplication.Repo;

import com.navin.dapp.DApplication.entity.DriverOrdersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverOrderRepository extends JpaRepository<DriverOrdersEntity,Integer> {
}
