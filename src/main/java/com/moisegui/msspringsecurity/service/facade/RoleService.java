package com.moisegui.msspringsecurity.service.facade;

import com.moisegui.msspringsecurity.bean.Role;

import java.util.Collection;

public interface RoleService {
    Role save(Role role);

    void save(Collection<Role> roles);

    Role findByAuthority(String authority);
}
