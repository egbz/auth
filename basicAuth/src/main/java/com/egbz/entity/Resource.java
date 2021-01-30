package com.egbz.entity;

/**
 * @author egbz
 * @date 2021/1/29
 */
public class Resource {
    private int resourceId;
    private String resourceType;
    private String resourceName;

    public Resource() {
    }

    public Resource(int resourceId, String resourceType, String resourceName) {
        this.resourceId = resourceId;
        this.resourceType = resourceType;
        this.resourceName = resourceName;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }
}
