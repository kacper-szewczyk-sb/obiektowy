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
                              String firstname, String email) throws MissingParameterException {
        checkForMissingArguments(login, password,
                firstname, email);
        checkForShort(login, 6, "Za krótki login");
        checkForShort(password, 8, "Za krótkie hasło");
        checkForDigits(password, "Hasło musi zawierać cyfry");

        return new User(login, password, firstname, email);
    }

    private static void checkForShort(String argument, int len, String message) {
        if (argument.length() < len) {
            throw new IllegalArgumentException(message);
        }
    }
    private static void checkForDigits(String argument, String message) {
        if (!argument.matches(".*\\d.*")) {
            throw new IllegalArgumentException(message);
        }
    }

    private static void checkForMissingArguments(String login, String password, String firstname, String email) throws MissingParameterException {
        checkIfArgumentIsNotEmpty(
                login, "Brakuje logina");
        checkIfArgumentIsNotEmpty(
                password, "Brakuje hasła");
        checkIfArgumentIsNotEmpty(
                firstname, "Brakuje imienia");
        checkIfArgumentIsNotEmpty(
                email, "Brakuje emaila");
    }

    private static void checkIfArgumentIsNotEmpty(String argument, String message) throws MissingParameterException {
        if (argument == null || "".equals(argument)) {
            throw new MissingParameterException(message);
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
