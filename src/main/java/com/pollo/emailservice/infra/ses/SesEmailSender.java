package com.pollo.emailservice.infra.ses;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.model.*;
import com.pollo.emailservice.adapters.EmailSenderGateway;
import com.pollo.emailservice.core.exceptions.EmailServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SesEmailSender implements EmailSenderGateway {

    private final AmazonSimpleEmailService sesClient;

    @Autowired
    public SesEmailSender(AmazonSimpleEmailService sesClient) {
        this.sesClient = sesClient;
    }

    @Override
    public void sendEmail(String toEmail, String subject, String body) {
        SendEmailRequest request = new SendEmailRequest()
                .withSource("renansk18@outlook.com")
                .withDestination(new Destination().withToAddresses(toEmail))
                .withMessage(new Message()
                        .withSubject(new Content(subject))
                        .withBody(new Body().withText(new Content(body)))
                );

        try {
            sesClient.sendEmail(request);
        } catch (AmazonServiceException ex) {
            throw new EmailServiceException("Email sending failed", ex);
        }
    }
}