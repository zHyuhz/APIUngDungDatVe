package com.DoAnChuyenNganh.UngDungDatVeXemPhim.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DoAnChuyenNganh.UngDungDatVeXemPhim.Models.User;
import com.DoAnChuyenNganh.UngDungDatVeXemPhim.Services.UserService;

@RestController
@RequestMapping
public class UserController {
	@Autowired
	
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> getAllUser(){
		return userService.getAllUser();
	}
	
}
