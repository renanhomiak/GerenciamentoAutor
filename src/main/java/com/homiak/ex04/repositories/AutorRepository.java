package com.homiak.ex04.repositories;

import com.homiak.ex04.models.AutorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<AutorModel, Long> {
}