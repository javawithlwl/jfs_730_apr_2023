package com.careerit.cms.service;

import com.careerit.cms.dto.AppUser;
import com.careerit.cms.repo.AppUserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
 @Service  
 @RequiredArgsConstructor  
 public class AppUserDetailsService implements UserDetailsService {  
  private final PasswordEncoder passwordEncoder;
  private final AppUserRepo appUserRepo;

  @Override  
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
   AppUser appUser = appUserRepo.findByUsername(username).orElseThrow(()->new UsernameNotFoundException("User not found with username : "+username));
   return User.builder()
       .username(appUser.getUsername())
       .password(appUser.getPassword())
       .authorities(appUser.getRoles().stream().map(ele->new SimpleGrantedAuthority(ele)).toList()).build();
  }
 }  