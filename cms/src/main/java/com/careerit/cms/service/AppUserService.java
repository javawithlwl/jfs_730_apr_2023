package com.careerit.cms.service;

import com.careerit.cms.dto.AppUser;
import com.careerit.cms.repo.AppUserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppUserService {

  private final AppUserRepo appUserRepo;
  private final PasswordEncoder passwordEncoder;

  public String registerUser(AppUser appUser) {
    appUser.setPassword(passwordEncoder.encode(appUser.getPassword()));
    appUser = appUserRepo.save(appUser);
    return "User registered successfully with id : " + appUser.getId();
  }
}
