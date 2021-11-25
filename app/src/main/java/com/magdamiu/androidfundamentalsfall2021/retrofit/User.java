package com.magdamiu.androidfundamentalsfall2021.retrofit;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("login")
    private String name;
    private int id;
    @SerializedName("node_id")
    private String nodeId;
    @SerializedName("avatar_url")
    private String avatarUrl;

    public User(String name) {
        this.name = name;
    }

    public String getUser() {
        return name;
    }

    public void setUser(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", nodeId='" + nodeId + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                '}';
    }
}