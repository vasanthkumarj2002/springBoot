package org.jsp.Userspringbootapp.Dao;

import java.util.List;
import java.util.Optional;

import org.jsp.Userspringbootapp.Dto.User;
import org.jsp.Userspringbootapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	@Autowired
	private UserRepository repository;

	public User saveUser(User user) {
		return repository.save(user);
	}
	public User updateUser(User user) {
		return repository.save(user);
	}
	public Optional<User> findUser(int id) {
		return repository.findById(id);
	}
	public List<User> findAll() {
		return repository.findAll();
	}
	public void deleteUser(int id) {
		repository.deleteById(id);
	}
}
