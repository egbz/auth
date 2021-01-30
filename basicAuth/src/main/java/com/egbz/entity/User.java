package com.egbz.entity;

import com.egbz.entity.Resource;
import com.egbz.entity.Role;

import java.util.ArrayList;
import java.util.List;

/**
 * @author egbz
 * @date 2021/1/29
 */
public class User {
    private int id;
    private String name;
    private String pwd;
    private List<Role> roles = new ArrayList<>();
    private List<Resource> resources = new ArrayList<>();

    public User() {
    }

    public User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    public boolean havePermission(String resourceName) {
        return this.resources.stream()
                .filter(resource -> resource.getResourceName().equals(resourceName))
                .count() > 0;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        roles = roles;
    }

    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }
}
