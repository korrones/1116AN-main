package com.example.authservice.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@Profile({"test", "dev"}) // Será usado quando o perfil ativo for "test" ou "dev"
public class LogEmailService implements EmailService {

    @Override
    public void enviar(String para, String assunto, String mensagem) {
        log.info("[EMAIL SIMULADO] Para: {}\nAssunto: {}\nMensagem:\n{}", para, assunto, mensagem);
    }
}
