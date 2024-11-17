package com.DoAnChuyenNganh.UngDungDatVeXemPhim.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.DoAnChuyenNganh.UngDungDatVeXemPhim.Models.Account;
import com.DoAnChuyenNganh.UngDungDatVeXemPhim.Services.AccountService;

@RestController
public class RegisterController {
	
	@Autowired
	private AccountService accountService;
	
	@PostMapping("/register")
	public ResponseEntity<String> registerAccount(@RequestBody Account account){
		ResponseEntity<String> response = null;
		try {
			
			if(accountService.existsByuserName(account.getUserName())==false && accountService.existsByemail(account.getEmail())==false) {
				response = ResponseEntity.status(HttpStatus.CREATED)
						.body("DANG KY THANH CONG: " + account.getUserName());
				accountService.createAccout(account);
			}else response = ResponseEntity.status(HttpStatus.REQUEST_TIMEOUT)
					.body("Username hoac Email da duoc su dung");
		}catch (Exception e) {
			response = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("ERROR FOR SERVER: " + e);
		}
		return response;
	}

}
