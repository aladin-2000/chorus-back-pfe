package com.chorus.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chorus.entities.Wallet;

public interface WalletRepository extends JpaRepository<Wallet, Long>{
	

}
