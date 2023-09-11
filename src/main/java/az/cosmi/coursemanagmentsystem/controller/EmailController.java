package az.cosmi.coursemanagmentsystem.controller;

import az.cosmi.coursemanagmentsystem.entity.Email;
import az.cosmi.coursemanagmentsystem.model.dto.email.EmailSendRequestDTO;
import az.cosmi.coursemanagmentsystem.service.EmailService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/email/send")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class EmailController {
    EmailService emailService;

    @Autowired
    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/text-message")
    public void sendEmail(@RequestBody EmailSendRequestDTO email) {
        emailService.mailSender(email);
        emailService.addToDb(email);
    }

    @PostMapping("/file-message")
    public void sendEmail(@RequestParam MultipartFile file) {

    }

//    public ResponseEntity<String> getString(@RequestParam(name = "con") boolean conditaion){
//        if (conditaion){
//            return new ResponseEntity<>(HttpStatus.OK);
//        }
//    }
}
