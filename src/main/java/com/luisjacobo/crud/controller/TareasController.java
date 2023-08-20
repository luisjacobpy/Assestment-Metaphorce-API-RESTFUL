package com.luisjacobo.crud.controller;

import com.luisjacobo.crud.entity.Tareas;
import com.luisjacobo.crud.service.TareasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api-restul/v1/tareas")

public class TareasController {
    @Autowired
    private final TareasService tareasService;

    // Constructor
    public TareasController(TareasService tareasService) {
        this.tareasService = tareasService;
    }

    @GetMapping
    public List<Tareas> getAll(){
        return tareasService.getTareas();
    }

    @GetMapping("/{TareaId}")
    public Optional<Tareas> getBId(@PathVariable("TareaId") Long tareaId){
        return tareasService.getTarea(tareaId);
    }
    @PostMapping
    public void saveUpdate(@RequestBody Tareas tarea) {
        tareasService.saveOrUpdate(tarea);
    }
    @DeleteMapping("/{tareaId}")
    public void saveUpdate(@PathVariable("tareaId") Long tareaId){
         tareasService.delete(tareaId);
    }


}
