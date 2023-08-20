package com.luisjacobo.crud.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name= "tbl_tareas")
public class Tareas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_tarea", unique = true, nullable = false)
    private Long tareaId;
    private String descripcion;
    private String estado;
}
