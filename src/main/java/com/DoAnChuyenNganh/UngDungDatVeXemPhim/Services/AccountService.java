package com.DoAnChuyenNganh.UngDungDatVeXemPhim.Services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DoAnChuyenNganh.UngDungDatVeXemPhim.Entity.Accounts;
import com.DoAnChuyenNganh.UngDungDatVeXemPhim.Exception.AppException;
import com.DoAnChuyenNganh.UngDungDatVeXemPhim.Exception.ErrorCode;
import com.DoAnChuyenNganh.UngDungDatVeXemPhim.Repo.AccountRepo;
import com.DoAnChuyenNganh.UngDungDatVeXemPhim.dto.request.RegisterAccountRequest;
import com.DoAnChuyenNganh.UngDungDatVeXemPhim.dto.request.UpdateAccountRequest;

import jakarta.transaction.Transactional;

@Service
public class AccountService {
	@Autowired
	private AccountRepo accountRepo;

	// lấy danh sách tài khoản
	public List<Accounts> getAllAccount() {
		return accountRepo.findAll();
	}

	// Kiểm tra username đã tồn tại hay chưa
	public boolean existsByuserName(String username) {
		return accountRepo.existsByuserName(username);
	}

	// Kiểm tra email đã tồn tại hay chưa
	public boolean existsByemail(String email) {
		return accountRepo.existsByemail(email);
	}

	// Tìm tài khoản
	public Accounts getAccount(String userName) {
		return accountRepo.findByuserName(userName).orElseThrow(() -> new AppException(ErrorCode.ACCOUNT_NOT_FOUND));
	}

	// Cập nhật tài khoản
	public Accounts updateAccount(String userName, UpdateAccountRequest request) {
		Accounts account = getAccount(userName);
		account.setEmail(request.getEmail());
		account.setPassword(request.getPassword());

		return accountRepo.save(account);
	}

	// Xóa tài khoản
	@Transactional
	public void deleteAccount(String userName) {
		accountRepo.deleteByuserName(userName);
	}

	// Tạo tài khoản
	public Accounts createAccount(RegisterAccountRequest request) {

		if (existsByuserName(request.getUserName())) {
			throw new AppException(ErrorCode.ACCOUNT_USERNAME_EXISTED);
		}
		if (existsByemail(request.getEmail())) {
			throw new AppException(ErrorCode.ACCOUNT_EMAIL_EXISTED);
		}

		Accounts account = new Accounts();
		Date date = new Date();
		account.setUserName(request.getUserName());
		account.setEmail(request.getEmail());
		account.setPassword(request.getPassword());
		account.setCreatedAt(date);
		account.setStatus(1);
		account.setAccountRole("User");
		return accountRepo.save(account);
	}
}
