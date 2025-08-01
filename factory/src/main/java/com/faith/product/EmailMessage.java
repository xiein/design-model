package com.faith.product;

import com.faith.factory.Message;

public class EmailMessage implements Message {

    @Override
    public void send(String to, String content) {
        System.out.println("Sending email to: " + to + " with content: " + content);
    }
}
