package com.homiak.ex04.services;

import com.homiak.ex04.models.AutorModel;
import com.homiak.ex04.repositories.AutorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {

    private final AutorRepository repository;

    public AutorService(AutorRepository repository) {
        this.repository = repository;
    }

    public AutorModel salvar(AutorModel autor) {
        return repository.save(autor);
    }

    public List<AutorModel> listar() {
        return repository.findAll();
    }

    public Optional<AutorModel> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}