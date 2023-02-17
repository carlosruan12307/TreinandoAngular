package com.back_angular.back_angular.repositorys;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.back_angular.back_angular.models.MomentsModel;

@Repository
public interface MomentsRepository extends JpaRepository<MomentsModel, Long> {
    Optional<MomentsModel> findById(Long id);
}
