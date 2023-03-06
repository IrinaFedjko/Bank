package banksecondPart;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        User[] cont = new User[10];
        cont[0] = new User("Lana", 77777, 2000.23, "female", 3);
        cont[1] = new User("Lisa", 122223, 3000.00, "female", 2);
        cont[2] = new User("John", 12223, 656.0, "man", 1);

        System.out.println("Welcome to our Bank! Choose an information...");
        System.out.println("Press: 1 - for register new User, 2- for adding or taking from your balance money, 3- Delete your account:  ");
        int userInput = scanner.nextInt();

        if (userInput == 1) {
            System.out.println("Please register and add information: ");
            System.out.println("Enter name: ");
            String userEnterName = scanner.next();
            System.out.println("Enter account number which is shown in your secret envelope: : ");
            int userEnterDescription = scanner.nextInt();
            System.out.println("Enter amount of money you would like to add or take: ");
            double userEnterPrice = scanner.nextDouble();
            System.out.println("Write your gender man or women: ");
            String userEnterGender = scanner.next();
            System.out.println("Please write your id: ");
            int userEnterId = scanner.nextInt();


            User newContact = new User(userEnterName, userEnterDescription, userEnterPrice, userEnterGender, userEnterId);
            cont[3] = newContact;
            for (User contact : cont) {
                System.out.println(contact.getName() + " " + contact.getAccountNumber() + " " + contact.getBalance() + " " + contact.isMan() + " " + contact.getUsersId());
            }
        }

        if (userInput == 2) {
            System.out.println("How much would you like to add or take?");
            double userMoneyInput = scanner.nextDouble();
            for (User contact : cont) {
                System.out.println(contact.getBalance() + userMoneyInput);

            }

        } else if (userInput == 3) {

            System.out.println("You deleted contact.");
            for (User user : cont) {
                System.out.println(user.getName() + " " +  user.getAccountNumber() + " "  + user.getBalance() + " "  + user.isMan() + " "  + user.getUsersId());
            }
        } else {
            System.out.println("Wrong input! ");

        }
    }

}



