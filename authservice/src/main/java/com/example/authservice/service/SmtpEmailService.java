package com.example.authservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
@Profile("prod") 
public class SmtpEmailService implements EmailService {

    @Autowired
    private JavaMailSender mailSender;

    @Override
    public void enviar(String para, String assunto, String mensagem) {
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo(para);
        mail.setSubject(assunto);
        mail.setText(mensagem);

        mailSender.send(mail);
    }
}
