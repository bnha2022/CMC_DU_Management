package cmc.du21.cms.service;

import cmc.du21.cms.dto.UserDTO;
import cmc.du21.cms.entity.User;
import cmc.du21.cms.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(UserDTO dto) {
        User newUser = new User();
        newUser.setUserName(newUser.getUserName());
        newUser.setPassword(newUser.getPassword());
        newUser.setEmail(newUser.getEmail());
        return userRepository.save(newUser);
    }
}
