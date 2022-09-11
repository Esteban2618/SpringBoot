package com.MinticCiclo3.demo.Servicios;

import com.MinticCiclo3.demo.Entidades.Empresa;
import com.MinticCiclo3.demo.Repositorios.IRepositorioEmpresa;
import org.apache.catalina.webresources.EmptyResourceSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
Todo lo relacionado con el sprint 2	Wilfer Daniel Ciro Maya
Entidades y repositorios en Spring Boot	Mateo Llano Avendaño  1:16
Creación de controladores REST para la empresa	Brandon Nicolas Bohorquez Muñoz, TDO
CRUD Básico con Java Sprint Boot	Juan Manuel Suarez, TDO 19
 */

@Service
public class ImplementacionServEmpresa implements IServicioEmpresa {

    //Adiciona dependencias
    @Autowired
    IRepositorioEmpresa repositorioEmpresa;

    @Override
    public List<Empresa> getAll() {
        return (List<Empresa>) repositorioEmpresa.findAll();
    }

    @Override
    public Empresa create(Empresa empresa) {
        return repositorioEmpresa.save(empresa);
    }

    @Override
    public Empresa getById(long id) {
        Empresa empresa = repositorioEmpresa.findById(id).orElse(null);     //valida si enceunta el id o da null
        return empresa;
    }

    @Override
    public Empresa update(long id, Empresa empresa) {
        Empresa empresaAuxiliar = repositorioEmpresa.findById(id).orElse(null);
        //empresaAuxiliar.setId(empresa.getId());
        empresaAuxiliar.setNit(empresa.getNit());
        //empresaAuxiliar.setUsuario(empresa.getUsuario());
        repositorioEmpresa.save(empresaAuxiliar);
        return  empresaAuxiliar;
    }

    @Override
    public boolean delete(long id) {
        boolean bandera = true;
        Empresa empresaAuxiliar = repositorioEmpresa.findById(id).orElse(null);

        if(empresaAuxiliar == null){
            bandera = false;
        }else{
            repositorioEmpresa.deleteById(id);
        }
        return bandera;
    }
}
