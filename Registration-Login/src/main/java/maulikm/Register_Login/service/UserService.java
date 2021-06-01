package maulikm.Register_Login.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import maulikm.Register_Login.model.User;
import maulikm.Register_Login.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);

}
