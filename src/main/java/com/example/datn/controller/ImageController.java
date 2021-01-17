package com.example.datn.controller;

import com.example.datn.model.Category;
import com.example.datn.model.Image;
import com.example.datn.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource("classpath:application.properties")
@CrossOrigin("*")
@RequestMapping("/images")
public class ImageController {
    @Autowired
    ImageService imageService;

    @GetMapping
    public ResponseEntity<Iterable<Image>> getAll() {
        Iterable<Image> images = imageService.findAll();
        return new ResponseEntity<>(images, HttpStatus.OK);
    }
}
