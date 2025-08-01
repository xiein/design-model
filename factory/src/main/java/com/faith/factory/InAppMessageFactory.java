package com.faith.factory;

import com.faith.product.InAppMessage;

public class InAppMessageFactory implements MessageFactory{
    @Override
    public Message createMessage() {
        return new InAppMessage();
    }
}
