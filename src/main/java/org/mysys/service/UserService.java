package org.mysys.service;

import java.util.Collection;
import java.util.stream.Collectors;

import org.mysys.model.User;
import org.mysys.model.Userrole;
import org.mysys.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String loginId) throws UsernameNotFoundException {
        User user = userRepository.findByLoginid(loginId);
        if (user == null){
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        return new org.springframework.security.core.userdetails.User(user.getLoginid(),
                user.getPassword(),
                mapRolesToAuthorities(user.getUserroles()));
    }

    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Userrole> roles){
        return roles.stream().filter(role-> role.getRole()!=null)
                .map(role -> new SimpleGrantedAuthority(role.getRole().getRolename()))
                .collect(Collectors.toList());
    }
    
	public User getUserByLoginid(String loginid) {
        return userRepository.findByLoginid(loginid);
    }
}
