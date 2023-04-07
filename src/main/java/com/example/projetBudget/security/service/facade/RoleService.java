package com.example.projetBudget.security.service.facade;


import com.example.projetBudget.security.bean.Role;

import java.util.Collection;

public interface RoleService {
    Role save(Role role);

    void save(Collection<Role> roles);

    Role findByAuthority(String authority);
}
