import java.util.Scanner;

public class LoginProgram {

    int maxTries = 3;
    int tries = 0;
    String correctUsername = "denver";
    String correctPassword = "pass123";
    Scanner scanner = new Scanner(System.in);

    void bioMetric() {
        while (tries < maxTries) {
            System.out.print("Enter username: ");
            String enteredUsername = scanner.nextLine();

            System.out.print("Enter password: ");
            String enteredPassword = getPasswordInput();

            // Check if the entered credentials are correct
            if (enteredUsername.equals(correctUsername) && enteredPassword.equals(correctPassword)) {
                System.out.println("Login successful!");
                break;
            } else {
                System.out.println("Invalid username or password. Please try again.");
                tries++;
                System.out.println("Remaining tries: " + (maxTries - tries));
            }
        }

        if (tries == maxTries) {
            System.out.println("Maximum login attempts reached. Account locked.");
        }
        scanner.close();
    }
    
    
    String getPasswordInput() {
        // Mask the password input with asterisks (*)
        String password = scanner.nextLine();
        return password;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        LoginProgram loginProgram = new LoginProgram();
        loginProgram.bioMetric();
    }
    
}
