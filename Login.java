import java.util.Scanner;

public class Login {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        String firstName = "";
        String lastName = "";
        String companyWebsite = "";

        System.out.println("Nimi?");
        firstName = in.nextLine();
        if (firstName.isEmpty()) {
            System.out.println("Virhe! Jokin tiedoista puuttuu.");
            in.close();
            return;
        }

        System.out.println("Sukunimi?");
        lastName = in.nextLine();
        if (lastName.isEmpty()) {
            System.out.println("Virhe! Jokin tiedoista puuttuu.");
            in.close();
            return;
        }

        System.out.println("Yrityksen verkkotunnukset?");
        companyWebsite = in.nextLine();
        if (companyWebsite.isEmpty()) {
            System.out.println("Virhe! Jokin tiedoista puuttuu.");
            in.close();
            return;
        }

        generateEmail(firstName, lastName, companyWebsite);
        generateUsername(firstName, lastName);

        in.close();

    }

    public static void generateEmail(String firstName, String lastName, String companyName) {
        String email = (firstName + "." + lastName + "@" + companyName + ".com");
        System.out.println(email);
    }

    public static void generateUsername(String firstName, String lastName) {
        String firstPart;
        String lastPart;

        if (firstName.length() >= 4) {
            firstPart = firstName.substring(0, 4);
        } else {
            firstPart = firstName;
        }

        if (lastName.length() >= 4) {
            lastPart = lastName.substring(lastName.length() - 4);
        } else {
            lastPart = lastName;
        }

        String username = (firstPart + lastPart).toLowerCase();
        System.out.println("Generated Username: " + username);
    }

}
