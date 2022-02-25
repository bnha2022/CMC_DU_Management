package cmc.du21.cms.controller;

import cmc.du21.cms.dto.UserDTO;
import cmc.du21.cms.http.Response;
import cmc.du21.cms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Response<?> saveUser(@RequestBody UserDTO dto) {
        return Response.ok().data(userService.saveUser(dto));
    }
}
