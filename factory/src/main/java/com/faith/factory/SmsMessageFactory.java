package com.faith.factory;

import com.faith.product.SmsMessage;

public class SmsMessageFactory implements MessageFactory{
    @Override
    public Message createMessage() {
        return new SmsMessage();
    }
}
