package com.MinticCiclo3.demo.Entidades;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString

@Table(name = "EMPRESAS")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(unique = true)
    private String nombre, nit;

    @Column
    private String telefono, direccion;

    @Column
    @OneToMany(mappedBy = "empresa", fetch= FetchType.LAZY)     //fetch: como uno se trae una información cuando hay relación. LAZY: relaciones pesadas eager: relaciones sencillas
    private List<Usuario> usuarios;

    @Column
    @OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY)
    private List<MovimientoDinero> movimientoDineros;

    @Column
    private Date actualizarAt;

    @Column
    private Date crearAt;
}