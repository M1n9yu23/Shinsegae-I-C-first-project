package service;

import dto.request.UserRequestDto;
import dto.response.UserResponseDto;
import java.util.List;

public interface UserService {
    void createUser(UserRequestDto request);

    List<UserResponseDto> findAll();

    UserResponseDto findById(int id);

    void updateUser(int id, UserRequestDto request);

    void updateUserPwd(int id, UserRequestDto request);

    void unregister(int id, UserRequestDto request);

    void delete(int id);
}
