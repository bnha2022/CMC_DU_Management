package cmc.du21.cms.service;

import cmc.du21.cms.dto.UserDTO;
import cmc.du21.cms.entity.CMCUser;

public interface UserService  {

    CMCUser saveUser(UserDTO dto);


}
