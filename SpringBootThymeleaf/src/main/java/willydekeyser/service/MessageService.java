package willydekeyser.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import willydekeyser.model.Message;

@Service
public class MessageService {
	
	
	private final List<Message> messages = new ArrayList<>();
	
	
	public List<Message> getMessages() {
		return messages;
	}
	
	public void addMessage(Message message) {
		messages.add(message);
	}

}
