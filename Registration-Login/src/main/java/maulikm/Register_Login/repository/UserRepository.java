package maulikm.Register_Login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import maulikm.Register_Login.model.User;

@Repository							//to perform crud on "User" entity and "Long" is type of primary key 
public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
