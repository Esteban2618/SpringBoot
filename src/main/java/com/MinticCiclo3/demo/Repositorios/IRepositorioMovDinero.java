package com.MinticCiclo3.demo.Repositorios;

import com.MinticCiclo3.demo.Entidades.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioMovDinero extends JpaRepository <MovimientoDinero, Long> {
}
