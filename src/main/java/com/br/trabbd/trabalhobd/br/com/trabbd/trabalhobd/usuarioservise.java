package com.br.trabbd.trabalhobd.br.com.trabbd.trabalhobd;

import com.br.trabbd.trabalhobd.model.Iusuario;
import com.br.trabbd.trabalhobd.model.usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class usuarioservise {
    private Iusuario repository;

    public usuarioservise(Iusuario repository){
        this.repository = repository;
    }

    public List<usuario> Listarusario(){
        List<usuario> lista = repository.findAll();
        return lista;
    }
}
