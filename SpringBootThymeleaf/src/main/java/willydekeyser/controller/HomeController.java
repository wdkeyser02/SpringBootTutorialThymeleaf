package willydekeyser.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import willydekeyser.model.Message;
import willydekeyser.model.Users;
import willydekeyser.service.MessageService;
import willydekeyser.service.UsersService;

@Controller
@RequiredArgsConstructor
public class HomeController {
	
	private final MessageService messageService;
	private final UsersService usersService;
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("title", "Welcome 'Spring Boot Tutorial'");
		return "index";
	}
	
	@GetMapping("/messages")
	public String messages(Model model) {
		model.addAttribute("title", "Messages!");
		List<Message> messages = messageService.getMessages();
		model.addAttribute("messages", messages);
		return "messages";
	}

	@GetMapping("/users")
	public String users(Model model) {
		model.addAttribute("title", "Users!");
		List<Users> users = usersService.getUsers();
		model.addAttribute("users", users);
		return "users";
	}
}
