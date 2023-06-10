package org.jsp.Userspringbootapp.Service;

import java.util.List;
import java.util.Optional;

import org.jsp.Userspringbootapp.Dao.UserDao;
import org.jsp.Userspringbootapp.Dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
private UserDao dao;
	
	public User saveUser(User user) {
		return dao.saveUser(user);
	}
	public User updateUser(User user) {
		return dao.saveUser(user);
	}
	public User findUser(int id) {
	 Optional<User> recUser=dao.findUser(id) ;
	 if(recUser.isPresent())
		 return recUser.get();
	 return null;
	}
	public List<User> findAll() {
		return dao.findAll();
	}
	public String deleteUser(int id) {
		 Optional<User> recUser=dao.findUser(id) ;
		if (recUser.isPresent()) {
			dao.deleteUser(id);
			return "user deleted";
		}
		return "Cannot find the user";
	}
	}

