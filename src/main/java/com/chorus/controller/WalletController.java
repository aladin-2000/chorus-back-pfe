package com.chorus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.chorus.dao.WalletRepository;
import com.chorus.entities.Wallet;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/wallets")
public class WalletController {

    @Autowired
    private WalletRepository walletRepository;

    // Create a new wallet
    @PostMapping
    public ResponseEntity<Wallet> createWallet(@RequestBody Wallet wallet) {
        Wallet savedWallet = walletRepository.save(wallet);
        return new ResponseEntity<>(savedWallet, HttpStatus.CREATED);
    }

    // Get a wallet by ID
    @GetMapping("/{id}")
    public ResponseEntity<Wallet> getWalletById(@PathVariable Long id) {
        Optional<Wallet> wallet = walletRepository.findById(id);
        return wallet.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                     .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Get all wallets
    @GetMapping
    public List<Wallet> getAllWallets() {
        return walletRepository.findAll();
    }

    // Update a wallet
    @PutMapping("/{id}")
    public ResponseEntity<Wallet> updateWallet(@PathVariable Long id, @RequestBody Wallet walletDetails) {
        Optional<Wallet> walletOptional = walletRepository.findById(id);
        if (walletOptional.isPresent()) {
            Wallet wallet = walletOptional.get();
            wallet.setAcdprt(walletDetails.getAcdprt());
            wallet.setAidprt(walletDetails.getAidprt());
            wallet.setAllprt(walletDetails.getAllprt());
           
            // Set other fields as needed
            Wallet updatedWallet = walletRepository.save(wallet);
            return new ResponseEntity<>(updatedWallet, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Delete a wallet
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWallet(@PathVariable Long id) {
        Optional<Wallet> wallet = walletRepository.findById(id);
        if (wallet.isPresent()) {
            walletRepository.delete(wallet.get());
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
