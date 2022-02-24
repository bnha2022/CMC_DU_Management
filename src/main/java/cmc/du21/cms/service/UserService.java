package cmc.du21.cms.service;

import cmc.du21.cms.dto.UserDTO;
import cmc.du21.cms.entity.User;

public interface UserService  {

    User saveUser(UserDTO dto);


}
