package cmc.du21.cms.service;

import cmc.du21.cms.dto.UserDTO;
import cmc.du21.cms.entity.CMCUser;
import cmc.du21.cms.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder bcryptEncoder;

    @Override
    public CMCUser saveUser(UserDTO dto) {
        CMCUser newCMCUser = new CMCUser();
        newCMCUser.setUsername(dto.getUsername());
        newCMCUser.setPassword(bcryptEncoder.encode(dto.getPassword()));
        return userRepository.save(newCMCUser);
    }
}
