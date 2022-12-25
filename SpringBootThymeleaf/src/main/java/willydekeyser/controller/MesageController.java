package willydekeyser.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;
import willydekeyser.model.Message;
import willydekeyser.service.MessageService;

@Controller
@RequiredArgsConstructor
public class MesageController {

	private final MessageService messageService;
	
	
	@GetMapping("/message")
	public String messageForm(Model model) {
		model.addAttribute("message", new Message());
		model.addAttribute("title", "Messages");
		return "message";
	}
	
	@PostMapping("/message")
	  public String greetingSubmit(@ModelAttribute Message message, Model model) {
		model.addAttribute("title", "Messages");
		List<Message> messages = messageService.addMessage(message);
		model.addAttribute("messages", messages);
	    return "result";
	  }
}
