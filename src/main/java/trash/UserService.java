package trash;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserRepo userRepo ;
	
	public List<User> getAllUser(){
		return userRepo.findAll();
	}
	

}
