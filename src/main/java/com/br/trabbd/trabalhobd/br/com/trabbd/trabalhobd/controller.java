package com.br.trabbd.trabalhobd.br.com.trabbd.trabalhobd;

import com.br.trabbd.trabalhobd.model.Iusuario;
import com.br.trabbd.trabalhobd.model.usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/usuario")
public class controller  {
    @Autowired
    private Iusuario dao;
    @GetMapping
    public List<usuario> listausurios(){
        return (List<usuario>) dao.findAll();
    }

    @PostMapping
    public usuario criarusuario(@RequestBody usuario usuario){
        usuario usuarioNovo = dao.save(usuario);
        return usuarioNovo;
    }

    @PutMapping
    public usuario editarrusuario(@RequestBody usuario usuario){
        usuario usuarioNovo = dao.save(usuario);
        return usuarioNovo;
    }

    @DeleteMapping("/{id}")
    public Optional<usuario> excluirusuario (@PathVariable Integer id){
        Optional<usuario> usuario = dao.findById(id);
        dao.deleteById(id);
        return usuario;
    }
}
