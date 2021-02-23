package com.org.mbs.controller;

import com.org.mbs.model.VegetableMarket;
import com.org.mbs.repository.VegetableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/VegCreate")
public class VegetableController {
    @Autowired
    VegetableRepository vegetableRepository;
    @PostMapping("/create")
    public void create(@RequestBody VegetableMarket vg){
        vegetableRepository.save(vg);
    }

}
