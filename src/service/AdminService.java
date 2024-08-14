package service;

import dto.AdminRequestDto;
import dto.AdminResponseDto;
import java.util.List;

public interface AdminService {
    void createAdmin(AdminRequestDto request);

    AdminResponseDto findById(int id);

    List<AdminResponseDto> findAll();

    List<AdminResponseDto> findByRole(String role);

    void updateAdmin(AdminRequestDto request);

    void updatePwd(AdminRequestDto request);
}
