package cms.service;

import cms.dto.UserDTO;
import cms.entity.CMCUser;
import cms.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final PasswordEncoder bcryptEncoder;

    public UserServiceImpl(UserRepository userRepository, PasswordEncoder bcryptEncoder) {
        this.userRepository = userRepository;
        this.bcryptEncoder = bcryptEncoder;
    }

    @Override
    public CMCUser saveUser(UserDTO dto) {
        CMCUser newCMCUser = new CMCUser();
        newCMCUser.setUsername(dto.getUsername());
        newCMCUser.setPassword(bcryptEncoder.encode(dto.getPassword()));
        return userRepository.save(newCMCUser);
    }
}
