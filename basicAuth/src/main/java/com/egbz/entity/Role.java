package com.egbz.entity;

import com.egbz.entity.Resource;

import java.util.List;

/**
 * @author egbz
 * @date 2021/1/29
 */
public class Role {
    private int roleId;
    private String roleName;
    private List<Resource> resources;

    public Role() {
    }

    public Role(int roleId, String roleName, List<Resource> resources) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.resources = resources;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }
}
