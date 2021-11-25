package com.magdamiu.androidfundamentalsfall2021.retrofit;

import java.util.List;

public interface OnGetUsersCallback {

    void onSuccess(List<User> users);

    void onError();
}