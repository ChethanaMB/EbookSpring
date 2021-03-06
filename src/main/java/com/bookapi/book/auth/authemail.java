package com.bookapi.book.auth;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class authemail {
    @Autowired
    private JavaMailSender javaMailSender;
 
    @GetMapping("/send")
    String sendEmail() {
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("ashwinpereira0@gmail.com");
 
        msg.setSubject("meow");
        msg.setText("Hello World");
 
        try {
            javaMailSender.send(msg);
            return "meowwwwwww sent!";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
