package com.faith;

import com.faith.factory.EmailMessageFactory;
import com.faith.service.NotificationService;


public class Main {
    public static void main(String[] args) {
        EmailMessageFactory emailMessageFactory = new EmailMessageFactory();
        NotificationService service = new NotificationService(emailMessageFactory);
        service.notifyUser("faith", "hello factory");
    }
}