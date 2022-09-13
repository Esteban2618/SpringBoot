package com.MinticCiclo3.demo.Servicios;

import com.MinticCiclo3.demo.Entidades.Empresa;

import java.util.List;

public interface IServicioEmpresa {
    //Método sin cuerpo

    //GET
    public List<Empresa> getAll();

    //POST
    public Empresa crear(Empresa empresa);

    //GET(id)
    public Empresa getById(long id);

    //PATCH
    public Empresa update(long id, Empresa empresa);

    //DELETE
    public boolean eliminar (long id);
}
