package com.org.mbs.repository;

import com.org.mbs.model.VegetableMarket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VegetableRepository extends JpaRepository<VegetableMarket,Integer> {
}
