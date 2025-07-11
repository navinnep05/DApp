package com.navin.dapp.DApplication.Repo;

import com.navin.dapp.DApplication.entity.DriverAvailabilityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverAvailabilityRepository extends JpaRepository<DriverAvailabilityEntity,Integer> {
}
