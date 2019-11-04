package com.example.demo.security.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.security.services.MyUserDetail;
import com.example.demo.domains.User;
import com.example.demo.repositories.UserRepository;
@Service
public class MyUserDetailsService implements UserDetailsService{

	
	@Autowired
	UserRepository userRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Optional<User> user=userRepository.findByUsername(username);
		user.orElseThrow(()-> new UsernameNotFoundException("not found" +username));
		return user.map(MyUserDetail::new).get();
	}
	
    
}
