package com.faith.service;

import com.faith.factory.Message;
import com.faith.factory.MessageFactory;

public class NotificationService {
    private final MessageFactory messageFactory;

    public NotificationService(MessageFactory factory) {
        this.messageFactory = factory;
    }

    public void notifyUser(String to, String content){
        Message message = messageFactory.createMessage();
        message.send(to, content);
    }
}
