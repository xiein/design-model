package com.faith.factory;

import com.faith.product.EmailMessage;

public class EmailMessageFactory implements MessageFactory{
    @Override
    public Message createMessage() {
        return new EmailMessage();
    }
}
