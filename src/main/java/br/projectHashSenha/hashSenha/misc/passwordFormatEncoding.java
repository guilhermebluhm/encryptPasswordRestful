package br.projectHashSenha.hashSenha.misc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class passwordFormatEncoding {

    @Bean
    public PasswordEncoder getEncoding(){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder;
    }

}
