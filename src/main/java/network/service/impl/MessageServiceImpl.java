package network.service.impl;

import network.config.EmailConfig;
import network.service.MessageService;

public class MessageServiceImpl implements MessageService {

    @Override
    public void sendMessage(String text, String to) {
        SimpleMailMessage simpleMessage = new SimpleMailMessage();
        simpleMessage.setTo(to);
        simpleMessage.setText(text);

        JavaMailSenderImpl mailSender = EmailConfig.mailSender();
        mailSender.send(simpleMessage);
    }
}
