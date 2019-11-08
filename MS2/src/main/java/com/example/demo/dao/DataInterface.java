package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.User;

public interface DataInterface extends CrudRepository<User, String>
{

}
