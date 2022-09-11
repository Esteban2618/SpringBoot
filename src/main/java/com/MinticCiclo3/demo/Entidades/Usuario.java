package com.MinticCiclo3.demo.Entidades;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity                                 //Anotación que permite crear una entidad a base de una clase
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString

@Table(name = "USUARIOS")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String email;

    @Column
    @OneToOne(mappedBy = "usuario") //, cascade = CascadeType.ALL)
    //@PrimaryKeyJoinColumn
    private Perfil perfil;

    @Column
    @Enumerated(value = EnumType.STRING)
    private Enum_RoleName rol;

    @Column
    @ManyToOne
    @JoinColumn(name = "empresa_id")    //a que atributo de la otra clase va apuntar
    private Empresa empresa;

    @Column
    @OneToMany(mappedBy = "usuario")
    private List<MovimientoDinero> movimientoDineros;

    @Column
    private Date actualizarAt;          //Date: Cuando se guardo o creo el registro

    @Column
    private Date crearAt;
}