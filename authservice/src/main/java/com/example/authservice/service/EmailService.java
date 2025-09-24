package com.example.authservice.service;

public interface EmailService {
    void enviar(String para, String assunto, String mensagem);
}
