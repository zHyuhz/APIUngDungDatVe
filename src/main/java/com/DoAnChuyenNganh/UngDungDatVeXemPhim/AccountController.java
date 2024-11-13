package com.DoAnChuyenNganh.UngDungDatVeXemPhim;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AccountController {
	@Autowired
	private AccountService accountService;
	@GetMapping("/accounts")
	public List<Account> getAllAccount() {
		return accountService.getAllAccount();
	}
//	@GetMapping("/ib")
//	public String message() {
//		return "HELLO WORD";
//	}
	
}
