package SuperMarket;

import java.util.Scanner;

    public class ScannerIssue {
        public static String name(Scanner scanner){
            System.out.println("Please write your name");
            String name = scanner.nextLine();
            return name;

        }
        public static int password(Scanner scanner){
            System.out.println("Please write your password");
            int password = scanner.nextInt();
            return password;
        }
        public static int cardnumber(Scanner scanner){
            System.out.println("Please write your cardnumber");
            int cardNumber = scanner.nextInt();
            return cardNumber;
        }
        public static String adress(Scanner scanner){
            System.out.println("Please write your adress");
            String adress = scanner.nextLine();
            return adress;
        }
        public static int valueItem(Scanner scanner, String name){
            System.out.println("Please write any itemWeight of "+name);
            int number = scanner.nextInt();

            return number;

        }
    }
