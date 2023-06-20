package com.careerit.jfs.cj.day22;
import com.careerit.jfs.cj.day21.JsonUtil;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LoginService {

  private List<User> userList;
  private Map<String,User> map;

  public LoginService() {
    userList = JsonUtil.loadUserData();
    map = userList.stream().collect(Collectors.toMap(User::getUsername, Function.identity()));
  }

  public User login(String username, String password) {
      User user = map.get(username);
      if (user != null && user.getPassword().equals(password)) {
        return user;
      }
      throw new IllegalArgumentException("Invalid username or password");
  }
}
