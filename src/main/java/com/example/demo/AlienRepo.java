package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer>{
          List<Alien> findByAname(String name);
}
