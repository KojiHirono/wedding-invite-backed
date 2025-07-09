package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.GuestInfo;

@Repository
public interface GuestInfoRepository extends JpaRepository<GuestInfo, Integer> {

}
