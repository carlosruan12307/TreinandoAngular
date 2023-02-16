package com.back_angular.back_angular.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.back_angular.back_angular.models.ComentarioModel;

@Repository
public interface ComentarioRepository extends JpaRepository<ComentarioModel, Long> {

}
