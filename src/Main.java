import controllers.LoginController;
import models.User;
import view.LoginView;

public class Main {
    public static void main(String[] args) {
        User userModel = new User();
        LoginView loginView = new LoginView();
        new LoginController(userModel, loginView);
    }
}