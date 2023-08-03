package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.ProgrammerClass.Programmer;
@Repository
public interface ProgrammerRepo extends JpaRepository<Programmer, Integer> {

}
