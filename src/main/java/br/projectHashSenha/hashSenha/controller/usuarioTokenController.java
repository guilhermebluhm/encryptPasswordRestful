package br.projectHashSenha.hashSenha.controller;

import br.projectHashSenha.hashSenha.model.UsuarioToken;
import br.projectHashSenha.hashSenha.service.impl.usuarioTokenImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class usuarioTokenController {

    @Autowired
    private usuarioTokenImpl impl;

    @GetMapping("/listar")
    @ResponseStatus(HttpStatus.OK)
    public List<UsuarioToken> getAll(){
        return this.impl.getAll();
    }

    @PostMapping("/criar")
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioToken addNewUser(@RequestBody UsuarioToken token){
        return this.impl.addNewUser(token);
    }

    @GetMapping("/validar")
    public boolean validateUserPassword(@RequestParam(required = false) int id,
                                        @RequestParam(required = false) String pass){
        return this.impl.validatePasswordUser(id,pass);
    }
}
