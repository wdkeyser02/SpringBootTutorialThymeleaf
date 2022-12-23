package willydekeyser.service;

import java.util.List;

import org.springframework.stereotype.Service;

import willydekeyser.model.Users;
import willydekeyser.repository.UsersRepository;

@Service
public class UsersService {
	
	private final UsersRepository usersRepository;

	public UsersService(UsersRepository usersRepository) {
		this.usersRepository = usersRepository;
	}
	
	public List<Users> getUsers() {
		return usersRepository.findAll();
	}

}
