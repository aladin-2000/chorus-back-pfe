package com.chorus.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WalletLot {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Wallet[] wallets;
	private Wallet walletRef;
	private boolean isTechnical;
	private boolean isLotOfWorkFlow;
	private WalletGroup walletGroup;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Wallet[] getWallets() {
		return wallets;
	}

	public void setWallets(Wallet[] wallets) {
		this.wallets = wallets;
	}

	public Wallet getWalletRef() {
		return walletRef;
	}

	public void setWalletRef(Wallet walletRef) {
		this.walletRef = walletRef;
	}

	public boolean isTechnical() {
		return isTechnical;
	}

	public void setTechnical(boolean isTechnical) {
		this.isTechnical = isTechnical;
	}

	public boolean isLotOfWorkFlow() {
		return isLotOfWorkFlow;
	}

	public void setLotOfWorkFlow(boolean isLotOfWorkFlow) {
		this.isLotOfWorkFlow = isLotOfWorkFlow;
	}

	public WalletGroup getWalletGroup() {
		return walletGroup;
	}

	public void setWalletGroup(WalletGroup walletGroup) {
		this.walletGroup = walletGroup;
	}

}
