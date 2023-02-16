package com.back_angular.back_angular.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.back_angular.back_angular.models.ComentarioModel;
import com.back_angular.back_angular.models.MomentsModel;
import com.back_angular.back_angular.repositorys.ComentarioRepository;
import com.back_angular.back_angular.repositorys.MomentsRepository;
import com.back_angular.back_angular.responses.MomentResponse;

import lombok.Getter;
import lombok.Setter;

@Service
@Getter
@Setter
public class MomentsService {
    @Autowired
    private MomentsRepository mRepository;

    @Autowired
    private MomentResponse momentResponse;

    @Autowired
    private ComentarioRepository comentarioRepository;

    public ResponseEntity<MomentResponse> cadastrarMomento(MomentsModel moment, String url) {
        moment.setUrl(url);
        mRepository.save(moment);

        momentResponse.setMensagem("cadastrado com sucesso");
        return new ResponseEntity<MomentResponse>(momentResponse, HttpStatus.OK);
    }
}
