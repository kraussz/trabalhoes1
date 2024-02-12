package com.br.trabbd.trabalhobd.model;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface Iusuario extends JpaRepository<usuario,Integer> {

}
