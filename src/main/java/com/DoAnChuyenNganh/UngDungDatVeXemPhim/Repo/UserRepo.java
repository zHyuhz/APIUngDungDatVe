package com.DoAnChuyenNganh.UngDungDatVeXemPhim.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DoAnChuyenNganh.UngDungDatVeXemPhim.Models.User;

public interface UserRepo extends JpaRepository<User, String> {

}
