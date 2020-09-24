package com.tuan.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tuan.springjwt.models.FileDB;



@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {

}
