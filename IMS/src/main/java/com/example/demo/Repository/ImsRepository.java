package com.example.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.ImsEntity;

@Repository
public interface ImsRepository extends JpaRepository<ImsEntity , Integer> {

	ImsEntity findByEmail(String email);

	ImsEntity findByMobile(String mobile);

	ImsEntity findByUsername(String username);


}
