package com.back_angular.back_angular.controllers;

import java.io.IOException;
import java.nio.file.Files;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.back_angular.back_angular.models.MomentsModel;
import com.back_angular.back_angular.responses.MomentResponse;
import com.back_angular.back_angular.services.MomentsService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@CrossOrigin(origins = "*")
public class MomentController {

    @Autowired
    private MomentsService mService;

    @GetMapping("/")
    public String ola() {
        return "bem vindo a api";
    }

    @GetMapping(value = "/cadastrarMomento")
    public void cadastrarMomento(@RequestPart("file") MultipartFile file, @RequestPart("moment") MomentsModel moment) {

        System.out.println(file.getOriginalFilename());
        System.out.println(moment.getTitulo());
    }
}
