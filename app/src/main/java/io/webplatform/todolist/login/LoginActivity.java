package io.webplatform.todolist.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;


import io.webplatform.todolist.R;
import io.webplatform.todolist.forgotpassword.ForgotPasswordActivity;
import io.webplatform.todolist.main.MainActivity;
/**
 * Created by Giorgio_Natili on 1/28/16.
 */
public class LoginActivity extends Activity implements LoginView, View.OnClickListener {

    private ProgressBar progressBar;
    private EditText username;
    private EditText password;
    private Button   recoverPassword;
    private LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        progressBar = (ProgressBar) findViewById(R.id.progress);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);

        recoverPassword = (Button) findViewById(R.id.forgot_password);
        recoverPassword.setText(getString(R.string.recover_password));

        findViewById(R.id.button).setOnClickListener(this);

        presenter = new LoginPresenterImpl(this);
    }

    @Override protected void onDestroy() {
        presenter.onDestroy();
        super.onDestroy();
    }

    @Override public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @Override public void setUsernameError() {
        username.setError(getString(R.string.username_error));
    }

    @Override public void setPasswordError() {
        password.setError(getString(R.string.password_error));
    }

    @Override public void navigateToHome(){
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    @Override public void onClick(View v) {
        presenter.validateCredentials(username.getText().toString(), password.getText().toString());
    }

    @Override public void showForgotPassword(){

        // TODO: Finalize the test for the `showForgotPassword` method

        // TODO: write a test for the method to dismiss the activity
        // TODO: Implement the method to dismiss the activity

        startActivity(new Intent(this, ForgotPasswordActivity.class));
        finish();
    }
}
