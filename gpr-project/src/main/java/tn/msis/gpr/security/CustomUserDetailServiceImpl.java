package tn.msis.gpr.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import tn.msis.gpr.domain.User;
import tn.msis.gpr.repository.UserRepository;

@Service
public class CustomUserDetailServiceImpl implements CustomUserDetailService {

	@Autowired
	private UserRepository repo;
	
	@Override
	public CustomUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<User> optionalUser = repo.findByFirstName(username);
		
		optionalUser.orElseThrow(()-> new UsernameNotFoundException("User not found!"));		
		
		return optionalUser.map(CustomUserDetails::new).get();
	}

}
