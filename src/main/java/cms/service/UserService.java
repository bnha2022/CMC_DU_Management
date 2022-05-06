package cms.service;


import cms.dto.UserDTO;
import cms.entity.CMCUser;

public interface UserService  {

    CMCUser saveUser(UserDTO dto);


}
