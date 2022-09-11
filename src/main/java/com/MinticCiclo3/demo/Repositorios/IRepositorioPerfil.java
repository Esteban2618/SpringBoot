package com.MinticCiclo3.demo.Repositorios;

import com.MinticCiclo3.demo.Entidades.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioPerfil extends JpaRepository <Perfil, String> {
}
