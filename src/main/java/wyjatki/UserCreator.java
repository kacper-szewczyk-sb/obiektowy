package wyjatki;

import java.util.Scanner;

public class UserCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj login: ");
        String login = scanner.next();
        System.out.print("Podaj hasło: ");
        String password = scanner.next();
        try {
            User user = User.create(login,
                    password, "2", "2@w.p");

            System.out.println(user.toString());
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getStackTrace().toString());
        }
        finally {
            System.out.println("Koniec programu");
        }
    }
}
