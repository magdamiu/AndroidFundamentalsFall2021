package com.magdamiu.androidfundamentalsfall2021.retrofit;

public interface OnPostIssueCallback {
    void onSuccess(Issue issue);
    void onError();
}