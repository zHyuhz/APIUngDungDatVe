package com.DoAnChuyenNganh.UngDungDatVeXemPhim;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
	@Autowired
	private AccountRepo accountRepo;
	
	public List<Account> getAllAccount(){
		return accountRepo.findAll();
	}

}
