package com.example.sche.soaptest4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class Sender {
    @Autowired
    private JmsTemplate jmsTemplate;
    
	//private String eventsQueue;


    // public Sender(String eventsQueue) {
    //     this.eventsQueue = eventsQueue;
	// }


	public void send(String message) {
        jmsTemplate.convertAndSend("events.q", message);
    }
}