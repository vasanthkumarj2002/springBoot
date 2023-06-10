package org.jsp.Userspringbootapp.repository;

import org.jsp.Userspringbootapp.Dto.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
