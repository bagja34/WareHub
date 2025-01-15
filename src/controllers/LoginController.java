package controllers;

import models.User;
import view.LoginView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController {
    private User user;
    private LoginView loginView;

    public LoginController(User userModel, LoginView loginView) {
        this.user = userModel;
        this.loginView = loginView;

        //Action listener untuk tombol submit
        loginView.getSubmitButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = loginView.getUsernameField().getText();
                String password = new String(loginView.getPasswordField().getPassword());

                if (userModel.isValid(username, password)) {
                    JOptionPane.showMessageDialog(null, "Login successful!");
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}

