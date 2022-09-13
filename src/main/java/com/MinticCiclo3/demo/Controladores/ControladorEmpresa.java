package com.MinticCiclo3.demo.Controladores;

import com.MinticCiclo3.demo.Entidades.Empresa;
import com.MinticCiclo3.demo.Servicios.IServicioEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("")
public class ControladorEmpresa {

    @Autowired
    IServicioEmpresa servicioEmpresa;

    //GET ALL
    @GetMapping("/empresas")
    @ResponseBody
    public List<Empresa> findAll(){
        return servicioEmpresa.getAll();
    }

    //POST
    @PostMapping("/empresas")
    @ResponseBody
    public Empresa crear(@RequestBody Empresa empresa){
        return servicioEmpresa.crear(empresa);
    }

    //GET ID
    @GetMapping("/{id}")
    @ResponseBody
    public Empresa findById(@PathVariable long id){
        return servicioEmpresa.getById(id);
    }

    //PATCH
    @PatchMapping("/{id}")
    @ResponseBody
    public Empresa update(@PathVariable long id, @RequestBody Empresa empresa ) {
        return servicioEmpresa.update(id, empresa);
    }

    //DELETE
    @DeleteMapping("/{id}")
    @ResponseBody
    public Boolean delete (@PathVariable long id){
        return servicioEmpresa.eliminar(id);
    }
}
