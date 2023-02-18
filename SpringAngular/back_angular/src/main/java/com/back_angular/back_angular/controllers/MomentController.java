package com.back_angular.back_angular.controllers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.back_angular.back_angular.models.MomentsModel;
import com.back_angular.back_angular.responses.MomentResponse;
import com.back_angular.back_angular.services.MomentsService;
import com.back_angular.back_angular.webmvc.WebMvc;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.websocket.server.PathParam;

@RestController

public class MomentController {

    @Autowired
    private WebMvc webMvc;

    @Autowired
    private MomentsService mService;

    @GetMapping("/")
    public String ola() {
        return "bem vindo a api";
    }

    @PostMapping(value = "/cadastrarMomento")
    public ResponseEntity<MomentResponse> cadastrarMomento(@RequestPart("file") MultipartFile file,
            @RequestPart("moment") MomentsModel moment)
            throws IOException {
        System.out.println(file.getOriginalFilename());
        Path pathFileExist = Paths.get("src/main/resources/static/" + file.getOriginalFilename());
        if (!(Files.exists(pathFileExist))) {
            Path pathImages = Paths.get("src/main/resources/static/");
            Files.copy(file.getInputStream(), pathImages.resolve(file.getOriginalFilename()));
        }
        return mService.cadastrarMomento(moment, (webMvc.getUrlImages() + file.getOriginalFilename()));

    }

    @GetMapping("/momento/{id}")
    public MomentsModel getMomento(@PathVariable("id") Long id) {
        return mService.getMomento(id);
    }

    @GetMapping("/momentos")
    public List<MomentsModel> getAllMomentos() {
        return mService.getAllMomentos();
    }
}
