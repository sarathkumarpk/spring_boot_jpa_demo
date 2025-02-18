package com.example.demo.controller;

import com.example.demo.repository.ActorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ActorListController {

    private final ActorRepository actorRepository;

    @GetMapping("/actor/{id}")
    public String actorNameForId(@PathVariable int id) {
        return actorRepository.findById(id).get().getFirstName() + " " + actorRepository.findById(id).get().getLastName();
    }
}
