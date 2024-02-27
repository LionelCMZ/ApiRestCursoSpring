package com.infsis.demo.Services.implement;

import com.infsis.demo.DTOs.UserDTO;
import com.infsis.demo.Models.User;
import com.infsis.demo.Services.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceimpl implements UserService {



    private UserDTO UsertoDto(User user){
        UserDTO userDTO=new UserDTO(
                user.getName(),
                user.getEmail()
        );
        return userDTO;
    }
    private UserDTO DtoToUser(UserDTO userDTO){
        User user=new User();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());

        return userDTO;
    }

    @Override
    public Optional<UserDTO> getUserById(Integer userId) {
        return Optional.empty();
    }

    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        return null;
    }

    @Override
    public UserDTO updateUser(Integer userId, UserDTO userDTO) {
        return null;
    }

    @Override
    public void delete(Integer userId) {

    }
}
