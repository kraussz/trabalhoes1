package com.br.trabbd.trabalhobd.br.com.trabbd.trabalhobd;

import com.br.trabbd.trabalhobd.model.Iusuario;
import com.br.trabbd.trabalhobd.model.usuario;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin("*")
@RequestMapping("/usuario")
public class controller  {
    @Autowired
    private Iusuario repository;
    private usuarioservise usuarioservise;
    public controller(usuarioservise usuarioservise){
        this.usuarioservise = usuarioservise;
    }
    @GetMapping
    public ResponseEntity<List<usuario>> listausurios(){
         return ResponseEntity.status(200).body(usuarioservise.Listarusario());
    }

    @PostMapping
    public ResponseEntity<?> criarUsuario(@Valid @RequestBody usuario usuario, BindingResult result) {
        usuario usuarioNovo = repository.save(usuario);
        if (result.hasErrors()) {
            List<String> errors = result.getAllErrors()
                    .stream()
                    .map(error -> error.getDefaultMessage())
                    .collect(Collectors.toList());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors);
        }

        // Lógica para salvar o usuário no banco de dados
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioNovo);
    }


    @PutMapping
    public ResponseEntity<usuario> editarrusuario(@RequestBody usuario usuario){
        usuario usuarioNovo = repository.save(usuario);
        return ResponseEntity.status(202).body(usuarioNovo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluirusuario (@PathVariable Integer id){

        repository.deleteById(id);
        return ResponseEntity.status(204).build();
    }
}
