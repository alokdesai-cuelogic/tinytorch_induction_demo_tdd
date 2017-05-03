package com.cuelogic.tdd;

/**
 * Created by nileshjarad on 04/08/16.
 */
public interface LoginView {
    void showErrorMessageForUserNamePassword();

    void showErrorMessageForMaxLoginAttempt();

    void showLoginSuccessMessage();
}
