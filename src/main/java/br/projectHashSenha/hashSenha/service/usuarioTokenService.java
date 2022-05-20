package br.projectHashSenha.hashSenha.service;

import br.projectHashSenha.hashSenha.model.UsuarioToken;

import java.util.List;

public interface usuarioTokenService {

    public List<UsuarioToken> getAll();
    public UsuarioToken addNewUser(UsuarioToken token);

}
