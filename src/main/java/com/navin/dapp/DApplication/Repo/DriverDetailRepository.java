package com.navin.dapp.DApplication.Repo;

import com.navin.dapp.DApplication.entity.DriverDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverDetailRepository  extends JpaRepository<DriverDetailEntity,Integer> {
}
