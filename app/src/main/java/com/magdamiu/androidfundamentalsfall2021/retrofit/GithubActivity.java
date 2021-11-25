package com.magdamiu.androidfundamentalsfall2021.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.magdamiu.androidfundamentalsfall2021.R;

import java.util.List;

public class GithubActivity extends AppCompatActivity {

    // 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
    private UsersRepository usersRepository;
    private IssuesRepository issuesRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github);

        //getGithubUsers();

        Issue issue = new Issue();
        issue.setTitle("This is a title of an issue sent from android");
        issue.setBody("hello! this is a test :) ");

        RepoDetails repoDetails = new RepoDetails();
        repoDetails.setRepo("AndroidFundamentalsFall2021");
        repoDetails.setToken("token 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");
        repoDetails.setUsername("magdamiu");
        createAnIssue(issue, repoDetails);
    }

    class RepoDetails {
        private String username;
        private String repo;
        private String token;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getRepo() {
            return repo;
        }

        public void setRepo(String repo) {
            this.repo = repo;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }
    }

    private void createAnIssue(Issue issue, RepoDetails repoDetails) {
        issuesRepository = IssuesRepository.getInstance();
        issuesRepository.postIssue(new OnPostIssueCallback() {
            @Override
            public void onSuccess(Issue issue) {
                Log.e("Github issue = ", issue.toString());
                Toast.makeText(GithubActivity.this, issue.toString(), Toast.LENGTH_LONG)
                        .show();
            }

            @Override
            public void onError() {
                Log.e("error Github", "check the code :D ");
                Toast.makeText(GithubActivity.this, "error posting an issue",
                        Toast.LENGTH_LONG).show();
            }
        }, repoDetails.username, repoDetails.repo, repoDetails.token, issue);
    }

    private void getGithubUsers() {
        usersRepository = UsersRepository.getInstance();

        usersRepository.getUsers(new OnGetUsersCallback() {
            @Override
            public void onSuccess(List<User> users) {
                StringBuilder stringBuilder = new StringBuilder();
                for (User user : users) {
                    stringBuilder.append(user.toString() + " /// ");
                }
                Log.e("Github users = ", users.toString());
                Toast.makeText(GithubActivity.this, stringBuilder.toString(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onError() {
                Log.e("error Github users = ", "check the code :D ");
                Toast.makeText(GithubActivity.this, "error getting the Github users",
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}