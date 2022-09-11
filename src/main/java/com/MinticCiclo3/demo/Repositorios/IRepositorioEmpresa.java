package com.MinticCiclo3.demo.Repositorios;

import com.MinticCiclo3.demo.Entidades.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositorioEmpresa extends JpaRepository <Empresa, Long>{
}
