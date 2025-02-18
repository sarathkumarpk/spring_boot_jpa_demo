package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Film;
import com.example.demo.repository.FilmRepository;

@RestController
public class FilmListController {

@Autowired	
private FilmRepository filmRepository;	

@Autowired
public FilmListController(FilmRepository filmRepository) {
	this.filmRepository = filmRepository;
}

@GetMapping("/films")
public List<Film> films() {

	List<Film> films = filmRepository.findAll();
	return films;
}

}
