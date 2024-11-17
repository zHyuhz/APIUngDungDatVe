package com.DoAnChuyenNganh.UngDungDatVeXemPhim.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DoAnChuyenNganh.UngDungDatVeXemPhim.Models.Account;

public interface AccountRepo extends JpaRepository<Account, String> {
	
	public boolean existsByuserName(String userName);
	public boolean existsByemail(String email);

}
