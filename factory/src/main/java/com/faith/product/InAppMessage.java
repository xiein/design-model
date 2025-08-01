package com.faith.product;

import com.faith.factory.Message;

public class InAppMessage implements Message {

    @Override
    public void send(String to, String content) {
        System.out.println("Sending 站内短信 to: " + to + " with content: " + content);
    }
}
