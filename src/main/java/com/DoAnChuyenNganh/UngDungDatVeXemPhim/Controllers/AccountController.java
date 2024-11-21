package com.DoAnChuyenNganh.UngDungDatVeXemPhim.Controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DoAnChuyenNganh.UngDungDatVeXemPhim.Entity.Accounts;
import com.DoAnChuyenNganh.UngDungDatVeXemPhim.Services.AccountService;
import com.DoAnChuyenNganh.UngDungDatVeXemPhim.dto.request.ApiResponse;
import com.DoAnChuyenNganh.UngDungDatVeXemPhim.dto.request.RegisterAccountRequest;
import com.DoAnChuyenNganh.UngDungDatVeXemPhim.dto.request.UpdateAccountRequest;

import jakarta.validation.Valid;



@RestController
@RequestMapping("/accounts")
public class AccountController {
	@Autowired
	private AccountService accountService;
	
	@GetMapping
	public List<Accounts> getAllAccount() {
		return accountService.getAllAccount();
	}
	@GetMapping("/{userName}")
	public Accounts getAccount(@PathVariable String userName) {
		return accountService.getAccount(userName);
	}
	
	@PostMapping("/register")
	public ApiResponse<Accounts> registerAccount(@RequestBody @Valid RegisterAccountRequest request){
		ApiResponse<Accounts> apiResponse = new ApiResponse<>();
		apiResponse.setResult(accountService.createAccount(request));
		return apiResponse;
	}
	
	
	@PutMapping("/{userName}")
	public Accounts updateAccount(@PathVariable @Valid String userName, @RequestBody UpdateAccountRequest request) {
		return accountService.updateAccount(userName, request);
	}
	@DeleteMapping("/{userName}")
	public String deleteAccount(@PathVariable String userName) {
		accountService.deleteAccount(userName);
		return "Tai khoan da bi xoa";
	}
}
