package az.cosmi.coursemanagmentsystem.service;

import az.cosmi.coursemanagmentsystem.entity.Email;
import az.cosmi.coursemanagmentsystem.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmailService1 {
    @Autowired
    private JavaMailSender javaMailSender;
    @Autowired
    private EmailRepository emailRepository;

    public void mailSender(Email email) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(email.getFrom());
        simpleMailMessage.setTo(email.getTo());
        simpleMailMessage.setSubject(email.getSubject());
        simpleMailMessage.setText(email.getMessage());

        javaMailSender.send(simpleMailMessage);
    }
    @Transactional
    public void addToDb(Email email) {
        emailRepository.save(email);
    }
}
