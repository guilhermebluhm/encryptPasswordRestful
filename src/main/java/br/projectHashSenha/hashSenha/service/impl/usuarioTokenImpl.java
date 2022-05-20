package br.projectHashSenha.hashSenha.service.impl;

import br.projectHashSenha.hashSenha.misc.passwordFormatEncoding;
import br.projectHashSenha.hashSenha.model.UsuarioToken;
import br.projectHashSenha.hashSenha.repository.usuarioTokenRepository;
import br.projectHashSenha.hashSenha.service.usuarioTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class usuarioTokenImpl implements usuarioTokenService {

    @Autowired
    private usuarioTokenRepository repository;

    @Autowired
    private passwordFormatEncoding cod;

    @Override
    public List<UsuarioToken> getAll() {
        return this.repository.findAll();
    }

    @Override
    public UsuarioToken addNewUser(UsuarioToken token) {
        token.setPassword(cod.getEncoding().encode(token.getPassword()));
        return this.repository.save(token);
    }

    public boolean validatePasswordUser(int id, String password){
        Boolean isValid = null;
        Optional<UsuarioToken> byId = this.repository.findById(id);
        if(byId.isEmpty()){
            return false;
        }
        isValid = this.cod.getEncoding().matches(password,byId.get().getPassword());
        return isValid;
    }
}
