package com.MinticCiclo3.demo.Entidades;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString

@Table(name = "TRANSACCIONES")
public class MovimientoDinero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column
    private String conceptoMovimiento;

    @Column
    private float monto;

    @Column
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @Column
    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;

    @Column
    private Date actualizarAt;

    @Column
    private Date crearAt;
}