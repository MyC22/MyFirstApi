package com.example.demo.Repositories;

import com.example.demo.Model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
}
