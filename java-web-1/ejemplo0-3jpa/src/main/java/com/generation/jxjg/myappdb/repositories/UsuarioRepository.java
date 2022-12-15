package com.generation.jxjg.myappdb.repositories;
import java.util.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.generation.jxjg.myappdb.models.UsuarioModel;

@Repository
public interface UsuarioRepository extends CrudRepository <UsuarioModel, Long>{
	public ArrayList <UsuarioModel>findByPrioridad(Integer prioridad);
}
