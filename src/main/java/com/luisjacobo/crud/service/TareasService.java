package com.luisjacobo.crud.service;

import com.luisjacobo.crud.entity.Tareas;
import com.luisjacobo.crud.repository.ITareasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TareasService {
    @Autowired
    ITareasRepository tareasRepository;

    public List<Tareas> getTareas(){

        return tareasRepository.findAll(); // Busca a todos los elementos y los retorna
    }
    // Por ID
    public Optional<Tareas> getTarea(Long id){

        return tareasRepository.findById(id); // Busca a un elemenoto por si Id
    }

    // Save and update
    public void saveOrUpdate(Tareas tareas) {
        tareasRepository.save(tareas);
    }

    public void delete(Long id){
        tareasRepository.deleteById(id);
    }

}

