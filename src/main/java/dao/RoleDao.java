package dao;

import entity.Role;

import java.util.List;

public interface RoleDao {
    Role login(String username, String password);

    boolean register(Role role);

    boolean check(Role role);

    boolean update(Role role);

    List<Role> findAll();

    Role findById(int id);
}
