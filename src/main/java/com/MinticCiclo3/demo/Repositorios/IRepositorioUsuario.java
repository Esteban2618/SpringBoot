package com.MinticCiclo3.demo.Repositorios;

import com.MinticCiclo3.demo.Entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioUsuario extends JpaRepository<Usuario, Long> {
}
