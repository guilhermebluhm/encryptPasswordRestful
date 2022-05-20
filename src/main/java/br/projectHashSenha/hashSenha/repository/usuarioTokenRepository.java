package br.projectHashSenha.hashSenha.repository;

import br.projectHashSenha.hashSenha.model.UsuarioToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface usuarioTokenRepository extends JpaRepository<UsuarioToken,Integer> {

}
