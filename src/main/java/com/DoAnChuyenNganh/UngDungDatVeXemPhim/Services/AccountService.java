package com.DoAnChuyenNganh.UngDungDatVeXemPhim.Services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DoAnChuyenNganh.UngDungDatVeXemPhim.Models.Account;
import com.DoAnChuyenNganh.UngDungDatVeXemPhim.Repo.AccountRepo;

@Service
public class AccountService {
	@Autowired
	private AccountRepo accountRepo;
	//lấy danh sách tài khoản
	public List<Account> getAllAccount(){
		return accountRepo.findAll();
	}
	//Kiểm tra username đã tồn tại hay chưa
	public boolean existsByuserName(String username) {
		return accountRepo.existsByuserName(username);
	}
	
	public boolean existsByemail(String email) {
		return accountRepo.existsByemail(email);
	}
	
	
	public Account createAccout(Account account) {
		account.setStatus(true);
		Date date = new Date();
		account.setCreatedAt(date);
		account.setAccountRole("User");
		return accountRepo.save(account);
	}
}
