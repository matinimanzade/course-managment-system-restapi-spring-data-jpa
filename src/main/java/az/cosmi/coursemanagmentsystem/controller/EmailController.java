package az.cosmi.coursemanagmentsystem.controller;

import az.cosmi.coursemanagmentsystem.entity.Email;
import az.cosmi.coursemanagmentsystem.service.EmailService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    private EmailService1 emailService;

    @Autowired
    public EmailController(EmailService1 emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/send")
    public void emailSend(@RequestBody Email email) {
        emailService.mailSender(email);
        emailService.addToDb(email);
    }
}
