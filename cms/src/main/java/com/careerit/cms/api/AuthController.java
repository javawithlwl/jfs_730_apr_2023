package com.careerit.cms.api;

import com.careerit.cms.config.JwtUtil;
import com.careerit.cms.dto.AppUser;
import com.careerit.cms.dto.LoginRequest;
import com.careerit.cms.dto.LoginResponse;

import com.careerit.cms.service.AppUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {
  private final AuthenticationManager authenticationManager;
  private final UserDetailsService userDetailsService;
  private final AppUserService appUserService;
  private final JwtUtil jwtUtil;

  @PostMapping("/login")
  public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
    authenticationManager.authenticate(
        new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword())
    );
    UserDetails userDetails = userDetailsService.loadUserByUsername(loginRequest.getUsername());
    String jwtToken = jwtUtil.generateToken(userDetails);
    return ResponseEntity.ok(new LoginResponse(jwtToken));
  }

  @PostMapping("/register")
  public ResponseEntity<String> register(@RequestBody AppUser appUser) {
    return ResponseEntity.ok(appUserService.registerUser(appUser));
  }

  @GetMapping("/greet")
  public ResponseEntity<String> greet(){
    return ResponseEntity.ok("Hello");
  }



}