package willydekeyser.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import willydekeyser.model.Message;

@Service
public class MessageService {
	
	public List<Message> getMessages() {
		List<Message> messages = new ArrayList<>();
		Message message = new Message(1L, "Message 01", "Text from the message! 01");
		messages.add(message);
		message = new Message(1L, "Message 02", "Text from the message! 02");
		messages.add(message);
		message = new Message(1L, "Message 03", "Text from the message! 03");
		messages.add(message);
		message = new Message(1L, "Message 04", "Text from the message! 04");
		messages.add(message);
		message = new Message(1L, "Message 05", "Text from the message! 05");
		messages.add(message);
		message = new Message(1L, "Message 06", "Text from the message! 06");
		messages.add(message);
		message = new Message(1L, "Message 07", "Text from the message! 07");
		messages.add(message);
		return messages;
	}

}
