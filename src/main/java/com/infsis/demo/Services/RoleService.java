package com.infsis.demo.Services;
import com.infsis.demo.DTOs.RoleDTO;
import java.util.List;
public interface RoleService {
    List<RoleDTO> getRoles();
    RoleDTO getRoleById(Integer roleId);
    RoleDTO saveRole(RoleDTO roleDTO);
    RoleDTO updateRole(Integer roleId, RoleDTO roleDTODTO);
    void delete(Integer roleId);
}
