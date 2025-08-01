package com.faith.factory;

/**
 * 抽象工厂接口：负责生产消息对象
 */
public interface MessageFactory {

    Message createMessage();

}
