package com.javachatV1.spring.ws.model;

import lombok.Getter;
import lombok.Setter;


public class ChatMessage {
	@Getter
	@Setter
	private String content;

	@Getter
	@Setter
	private String sender;

	@Getter
	@Setter
	private MessageType type;


	public enum MessageType {
		CHAT, LEAVE, JOIN
	}

}
