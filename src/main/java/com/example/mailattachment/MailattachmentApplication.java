package com.example.mailattachment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import jakarta.mail.MessagingException;

@SpringBootApplication
public class MailattachmentApplication {

	@Autowired
	private EmailSenderService emailSenderService;

	public static void main(String[] args) {
		SpringApplication.run(MailattachmentApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void triggeredEmail() throws Exception{
		emailSenderService.sendMailWithAttachment("anvitgogoa@gmail.com", "This is body", "This is Email with attachments", "C:/Users/anvdu/Desktop/Resume.pdf");
	}

}
