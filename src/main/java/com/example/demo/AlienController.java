package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Alien;

@Controller
public class AlienController {

	@Autowired
	AlienRepo repo;

	@RequestMapping("/add")
	public void addData(Alien alien) {
		System.out.println(alien);
		repo.save(alien);
	}

	@RequestMapping("/get")
	public void getData(@RequestParam int aid) {
		System.out.println(aid);
		Alien a = repo.findById(aid).orElse(new Alien());
		System.out.println(a);

	}
	@RequestMapping("/getAll")
	public void getAllData(@RequestParam String name) {
		System.out.println(name);
		List<Alien> alien = repo.findByAname("rajesh");
		System.out.println(alien);

	}
	
}
