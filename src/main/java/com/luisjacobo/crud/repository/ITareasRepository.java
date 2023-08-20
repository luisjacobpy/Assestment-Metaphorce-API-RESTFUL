package com.luisjacobo.crud.repository;

import com.luisjacobo.crud.entity.Tareas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITareasRepository extends JpaRepository<Tareas, Long> {
}
