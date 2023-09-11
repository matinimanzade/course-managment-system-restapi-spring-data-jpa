package az.cosmi.coursemanagmentsystem.service;

import az.cosmi.coursemanagmentsystem.entity.Email;
import az.cosmi.coursemanagmentsystem.model.dto.email.EmailSendRequestDTO;
import az.cosmi.coursemanagmentsystem.model.mappers.EmailEntityMapper;
import az.cosmi.coursemanagmentsystem.repository.EmailRepository;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class EmailService {
    JavaMailSender javaMailSender;
    EmailRepository emailRepository;

    @Autowired
    public EmailService(JavaMailSender javaMailSender, EmailRepository emailRepository) {
        this.javaMailSender = javaMailSender;
        this.emailRepository = emailRepository;
    }

    public void mailSender(EmailSendRequestDTO email) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

        simpleMailMessage.setFrom(email.getFrom());
        simpleMailMessage.setTo(email.getTo());
        simpleMailMessage.setSubject(email.getSubject());
        simpleMailMessage.setText(email.getMessage());

        javaMailSender.send(simpleMailMessage);
    }

    public void sendFileAndMessage() {

    }

    @Transactional
    public void addToDb(EmailSendRequestDTO emailDTO) {
        Email email = EmailEntityMapper.INSTANCE.fromEmailSendRequestDTO(emailDTO);
        emailRepository.save(email);
    }
}
