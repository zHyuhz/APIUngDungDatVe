package com.DoAnChuyenNganh.UngDungDatVeXemPhim.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DoAnChuyenNganh.UngDungDatVeXemPhim.Models.User;
import com.DoAnChuyenNganh.UngDungDatVeXemPhim.Repo.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo userRepo ;
	
	public List<User> getAllUser(){
		return userRepo.findAll();
	}
	

}
