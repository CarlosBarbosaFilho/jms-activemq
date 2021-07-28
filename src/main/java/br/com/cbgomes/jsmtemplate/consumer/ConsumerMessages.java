package br.com.cbgomes.jsmtemplate.consumer;

import br.com.cbgomes.jsmtemplate.model.MessageDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerMessages {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConsumerMessages.class);

    @JmsListener(destination = "message-queue")
    public void onMessage(MessageDTO messageContent){
        LOGGER.info("received messages {}", messageContent);

    }
}
