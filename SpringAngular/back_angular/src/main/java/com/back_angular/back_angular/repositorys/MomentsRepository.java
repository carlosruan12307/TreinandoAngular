package com.back_angular.back_angular.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.back_angular.back_angular.models.MomentsModel;

@Repository
public interface MomentsRepository extends JpaRepository<MomentsModel, Long> {

}
