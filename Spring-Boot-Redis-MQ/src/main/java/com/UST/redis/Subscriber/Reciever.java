package com.UST.redis.Subscriber;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;

public class Reciever implements MessageListener {

    Logger logger= LoggerFactory.getLogger(Reciever.class);
    @Override
    public void onMessage(Message message, byte[] bytes) {
        logger.info("Consumed Event",message);
    }
}
