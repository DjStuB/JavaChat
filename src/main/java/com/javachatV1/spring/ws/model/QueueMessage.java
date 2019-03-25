package com.javachatV1.spring.ws.model;
import java.util.ArrayList;

public class QueueMessage {
    ArrayList<String> message = new ArrayList<>();
    public void AddQueue(String chatMessage) {
        message.add(chatMessage);
    }
}
