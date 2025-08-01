package com.faith.product;

import com.faith.factory.Message;

public class SmsMessage implements Message {

    @Override
    public void send(String to, String content) {
        System.out.println("Sending sms to: " + to + " with content: " + content);
    }
}
