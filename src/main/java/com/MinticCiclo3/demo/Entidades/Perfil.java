package com.MinticCiclo3.demo.Entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString

@Table(name = "PERFILES")
public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column
    private String imagen, telefono;

    @Column
    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @Column
    private Date crearAt;

    @Column
    private Date actualizarAt;
}
