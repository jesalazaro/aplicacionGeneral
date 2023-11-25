package com.module.driveEase.dto.admin;


import com.module.driveEase.domain.admin.User;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserDtoConver {

    private final ModelMapper modelMapper;

    public UserDto converToDto(User user){
        return modelMapper.map(user, UserDto.class);
    }

}
