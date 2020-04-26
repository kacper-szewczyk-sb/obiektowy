package wyjatki;

import java.time.LocalDate;

public class User {
    private String login;
    private String password;
    private String firstname;
    private String email;
    private LocalDate creationDate;

    private User(String login, String password, String firstname, String email) {
        this.login = login;
        this.password = password;
        this.firstname = firstname;
        this.email = email;
        this.creationDate = LocalDate.now();
    }

    public static User create(String login, String password,
                              String firstname, String email) {
        checkForMissingArguments(login, password,
                firstname, email);
        checkForShortLogin(login);
        return new User(login, password, firstname, email);
    }

    private static void checkForShortLogin(String login) {
        if (login.length() < 6) {
            throw new IllegalArgumentException("Za krótki login");
        }
    }

    private static void checkForMissingArguments(String login, String password, String firstname, String email) {
        checkIfArgumentIsNotEmpty(
                login, "Brakuje logina");
        checkIfArgumentIsNotEmpty(
                password, "Brakuje hasła");
        checkIfArgumentIsNotEmpty(
                firstname, "Brakuje imienia");
        checkIfArgumentIsNotEmpty(
                email, "Brakuje emaila");
    }

    private static void checkIfArgumentIsNotEmpty(String argument, String message) {
        if (argument == null || "".equals(argument)) {
            throw new IllegalArgumentException(message);
        }
    }

    @Override
    public String toString() {
        return "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", firstname='" + firstname + '\'' +
                ", email='" + email + '\'' +
                ", creationDate=" + creationDate;
    }
}
