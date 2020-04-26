package wyjatki;

import java.util.Scanner;

public class UserCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj login: ");
        String login = scanner.next();
        System.out.print("Podaj hasło: ");
        String password = scanner.next();
        System.out.print("Podaj imię: ");
        String firstname = scanner.next();
        System.out.print("Podaj email: ");
        String email = scanner.next();
        try {
            User user = User.create(
                    login,
                    password,
                    firstname,
                    email);

            System.out.println(user.toString());
        }
        catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Koniec programu");
        }
    }
}
