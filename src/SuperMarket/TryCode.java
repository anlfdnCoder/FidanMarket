package SuperMarket;

import java.util.Scanner;


    public class TryCode {
        public static void main(String[] args) {
            Customer customer = new Customer("muster", 111, 222, "muster");
            Customer customer1 = new Customer("muster", 567);
            Item itemObst = new Obst("Ananas", 2.00, 1);
            Item itemGemuse = new Gemuse("Gemuse", 4.00, 1);
            Item itemGemuse1 = new Gemuse("Kartoffel", 2.00, 1);
            Item itemGemuse2 = new Gemuse("Tomate", 3.50, 1);
            Item itemGemuse3 = new Gemuse("Selleri", 1.00, 1);
            Item itemGemuse4 = new Gemuse("Karotte", 1.50, 1);
            Item itemGemuse5 = new Gemuse("Spinat", 1.30, 1);

            Item itemObst1 = new Obst("Apfel", 2.00, 1);
            Item itemObst2 = new Obst("Grape", 3.00, 1);
            Item itemObst3 = new Obst("Kiwi", 1.00, 1);
            Item itemObst4 = new Obst("Orange", 1.50, 1);
            Item itemObst5 = new Obst("Erdbeere", 4.00, 1);

            int totalValueGramGemuse1 = 5000;// total item1 value in the storage.
            int totalValueGramGemuse2 = 5000;// total item2 value in the storage.
            int totalValueGramGemuse3 = 5000;// total item3 value in the storage.
            int totalValueGramGemuse4 = 5000;// total item4 value in the storage.
            int totalValueGramGemuse5 = 5000;// total item5 value in the storage.

            int totalValueGramObst1 = 5000;// total item1 value in the storage.
            int totalValueGramObst2 = 5000;// total item2 value in the storage.
            int totalValueGramObst3 = 5000;// total item3 value in the storage.
            int totalValueGramObst4 = 5000;// total item4 value in the storage.
            int totalValueGramObst5 = 5000;// total item5 value in the storage.
            Scanner scanner = new Scanner(System.in);
            int itemNumber;
            String name;
            String adress;
            int password;
            int cardnumber;
            String itemName;
            int numberItem;
            int number2 = 0;
            String confirm="yes";
            boolean flag = true;
            boolean flag1 =true;
            boolean flag2 = true;
            int numberCase1Changing = 0;
            int numberCase2Changing = 1;
            System.out.println("Welcome to Fidan-Supermarkt" +
                    "\nbitte melden sie sich für online Einkaufen an!");
//        Registration.registration();
            while (flag) {
                Registration.registration();
                flag1=true;
                flag2=true;
                int number = scanner.nextInt();
                scanner.nextLine();
                switch (number) {
                    case 1:
                        numberCase1Changing++;
                        name = ScannerIssue.name(scanner);
                        password = ScannerIssue.password(scanner);
                        scanner.nextLine();
                        cardnumber = ScannerIssue.cardnumber(scanner);
                        scanner.nextLine();
                        adress = ScannerIssue.adress(scanner);
                        customer.addMember(name, password, cardnumber, adress);
                        while (flag2) {
                            flag1 = true;
                            MenuCustomer.MenuCustomer();
                            System.out.println("please choose any number");
                            number = scanner.nextInt();
                            scanner.nextLine();
                            if (number == 5) {
                                flag2 = false;
                                flag1 = false;
                                flag = false;
                            }
                            while (flag1) {
                                if (number == 1) {
                                    MenuCustomer.itemMenu();
                                    itemNumber = scanner.nextInt();
                                    if (itemNumber == 1) {
                                        MenuCustomer.VegetableMenu();
                                        int number1 = scanner.nextInt();
                                        switch (number1) {
                                            case 1:
                                                itemName = SelectItemList.selectedNameVegetable(number1);
                                                number2 = ScannerIssue.valueItem(scanner, itemName);
                                                totalValueGramGemuse1 = itemGemuse1.addSelectedItem(totalValueGramGemuse1, number1, number2, number2);
                                                break;
                                            case 2:
                                                itemName = SelectItemList.selectedNameVegetable(number1);
                                                number2 = ScannerIssue.valueItem(scanner, itemName);
                                                totalValueGramGemuse2 = itemGemuse2.addSelectedItem(totalValueGramGemuse2, number1, number2, number2);
                                                break;
                                            case 3:
                                                itemName = SelectItemList.selectedNameVegetable(number1);
                                                number2 = ScannerIssue.valueItem(scanner, itemName);
                                                totalValueGramGemuse3 = itemGemuse3.addSelectedItem(totalValueGramGemuse3, number1, number2, number2);
                                                break;
                                            case 4:
                                                itemName = SelectItemList.selectedNameVegetable(number1);
                                                number2 = ScannerIssue.valueItem(scanner, itemName);
                                                totalValueGramGemuse4 = itemGemuse4.addSelectedItem(totalValueGramGemuse4, number1, number2, number2);
                                                break;
                                            case 5:
                                                itemName = SelectItemList.selectedNameVegetable(number1);
                                                number2 = ScannerIssue.valueItem(scanner, itemName);
                                                totalValueGramGemuse5 = itemGemuse5.addSelectedItem(totalValueGramGemuse5, number1, number2, number2);
                                                break;
                                            case 6:
                                                break;
                                        }
                                    } else if (itemNumber == 2) {
                                        MenuCustomer.FruitMenu();
                                        int numberFruit = scanner.nextInt();
                                        switch (numberFruit) {
                                            case 1:
                                                itemName = SelectItemList.selectedNameFruit(numberFruit);
                                                number2 = ScannerIssue.valueItem(scanner, itemName);
                                                totalValueGramObst1 = itemObst1.addSelectedItem(totalValueGramObst1, numberFruit, number2, number2);
                                                break;
                                            case 2:
                                                itemName = SelectItemList.selectedNameFruit(numberFruit);
                                                number2 = ScannerIssue.valueItem(scanner, itemName);
                                                totalValueGramObst2 = itemObst2.addSelectedItem(totalValueGramObst2, numberFruit, number2, number2);
                                                break;
                                            case 3:
                                                itemName = SelectItemList.selectedNameFruit(numberFruit);
                                                number2 = ScannerIssue.valueItem(scanner, itemName);
                                                totalValueGramObst3 = itemObst3.addSelectedItem(totalValueGramObst3, numberFruit, number2, number2);
                                                break;
                                            case 4:
                                                itemName = SelectItemList.selectedNameFruit(numberFruit);
                                                number2 = ScannerIssue.valueItem(scanner, itemName);
                                                totalValueGramObst4 = itemObst4.addSelectedItem(totalValueGramObst4, numberFruit, number2, number2);
                                                break;
                                            case 5:
                                                itemName = SelectItemList.selectedNameFruit(numberFruit);
                                                number2 = ScannerIssue.valueItem(scanner, itemName);
                                                totalValueGramObst5 = itemObst5.addSelectedItem(totalValueGramObst5, numberFruit, number2, number2);
                                                break;
                                            case 6:
                                                break;
                                        }
                                    } else if (itemNumber == 3) {
                                        break;
                                    }
                                } else if (number == 2) {
                                    itemGemuse1.showOrder();
                                    itemGemuse2.showOrder();
                                    itemGemuse3.showOrder();
                                    itemGemuse4.showOrder();
                                    itemGemuse5.showOrder();

                                    itemObst1.showOrder();
                                    itemObst2.showOrder();
                                    itemObst3.showOrder();
                                    itemObst4.showOrder();
                                    itemObst5.showOrder();

                                    System.out.println("If you accept this liste please back to Menu then u can pay your items" +
                                            "\n\t for that please click \"n\"");
                                    String exit = scanner.next();
                                    if (exit.equalsIgnoreCase("n")) {
                                        System.out.println("you accepted your List");
                                        flag1 = false;
                                    }

                                } else if (number == 3) {
                                    customer.showMemberInputList();
                                    System.out.println("Do you confirm your personally account data?"+
                                            "\n\t yes or no?");
                                    confirm = scanner.nextLine();
                                    if (!(confirm.equalsIgnoreCase("yes"))){
                                        flag1 = false;
                                        flag2=false;
                                    }else {
                                        itemGemuse.showOrder();
                                        itemObst.showOrder();
                                        System.out.println("please confirm your Payment "+" y/n ");
                                        confirm = scanner.nextLine();
                                        if (confirm.equalsIgnoreCase("y")){
                                            System.out.println("your Payment was confirmed");
                                            System.out.println("your order is sent");
                                            System.out.println("Thank you for order!");
                                            flag1=false;
                                        }else {
                                            System.out.println("your payment was broken"+
                                                    "\nif you want to go on with your orderList click number 3"+
                                                    "\nif you want to exit the system click number 4");
                                            System.out.println();
                                            flag1=false;
                                            flag2=false;
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case 2:
                        numberCase1Changing++;
                        name = ScannerIssue.name(scanner);
                        password = ScannerIssue.password(scanner);
                        scanner.nextLine();
                        customer1.addCustomer(name,password);
                        while (flag2) {
                            flag1 = true;
                            MenuCustomer.MenuCustomer();
                            System.out.println("please choose any number");
                            number = scanner.nextInt();
                            scanner.nextLine();
                            if (number == 5) {
                                flag2 = false;
                                flag1 = false;
                                flag = false;
                            }
                            while (flag1) {
                                if (number == 1) {
                                    MenuCustomer.itemMenu();
                                    itemNumber = scanner.nextInt();
                                    if (itemNumber == 1) {
                                        MenuCustomer.VegetableMenu();
                                        int number1 = scanner.nextInt();
                                        switch (number1) {
                                            case 1:
                                                itemName = SelectItemList.selectedNameVegetable(number1);
                                                number2 = ScannerIssue.valueItem(scanner, itemName);
                                                totalValueGramGemuse1 = itemGemuse1.addSelectedItem(totalValueGramGemuse1, number1, number2, number2);
                                                break;
                                            case 2:
                                                itemName = SelectItemList.selectedNameVegetable(number1);
                                                number2 = ScannerIssue.valueItem(scanner, itemName);
                                                totalValueGramGemuse2 = itemGemuse2.addSelectedItem(totalValueGramGemuse2, number1, number2, number2);
                                                break;
                                            case 3:
                                                itemName = SelectItemList.selectedNameVegetable(number1);
                                                number2 = ScannerIssue.valueItem(scanner, itemName);
                                                totalValueGramGemuse3 = itemGemuse3.addSelectedItem(totalValueGramGemuse3, number1, number2, number2);
                                                break;
                                            case 4:
                                                itemName = SelectItemList.selectedNameVegetable(number1);
                                                number2 = ScannerIssue.valueItem(scanner, itemName);
                                                totalValueGramGemuse4 = itemGemuse4.addSelectedItem(totalValueGramGemuse4, number1, number2, number2);
                                                break;
                                            case 5:
                                                itemName = SelectItemList.selectedNameVegetable(number1);
                                                number2 = ScannerIssue.valueItem(scanner, itemName);
                                                totalValueGramGemuse5 = itemGemuse5.addSelectedItem(totalValueGramGemuse5, number1, number2, number2);
                                                break;
                                            case 6:
                                                break;
                                        }
                                    } else if (itemNumber == 2) {
                                        MenuCustomer.FruitMenu();
                                        int numberFruit = scanner.nextInt();
                                        switch (numberFruit) {
                                            case 1:
                                                itemName = SelectItemList.selectedNameFruit(numberFruit);
                                                number2 = ScannerIssue.valueItem(scanner, itemName);
                                                totalValueGramObst1 = itemObst1.addSelectedItem(totalValueGramObst1, numberFruit, number2, number2);
                                                break;
                                            case 2:
                                                itemName = SelectItemList.selectedNameFruit(numberFruit);
                                                number2 = ScannerIssue.valueItem(scanner, itemName);
                                                totalValueGramObst2 = itemObst2.addSelectedItem(totalValueGramObst2, numberFruit, number2, number2);
                                                break;
                                            case 3:
                                                itemName = SelectItemList.selectedNameFruit(numberFruit);
                                                number2 = ScannerIssue.valueItem(scanner, itemName);
                                                totalValueGramObst3 = itemObst3.addSelectedItem(totalValueGramObst3, numberFruit, number2, number2);
                                                break;
                                            case 4:
                                                itemName = SelectItemList.selectedNameFruit(numberFruit);
                                                number2 = ScannerIssue.valueItem(scanner, itemName);
                                                totalValueGramObst4 = itemObst4.addSelectedItem(totalValueGramObst4, numberFruit, number2, number2);
                                                break;
                                            case 5:
                                                itemName = SelectItemList.selectedNameFruit(numberFruit);
                                                number2 = ScannerIssue.valueItem(scanner, itemName);
                                                totalValueGramObst5 = itemObst5.addSelectedItem(totalValueGramObst5, numberFruit, number2, number2);
                                                break;
                                            case 6:
                                                break;
                                        }
                                    } else if (itemNumber == 3) {
                                        break;
                                    }
                                } else if (number == 2) {
                                    itemGemuse1.showOrder();
                                    itemGemuse2.showOrder();
                                    itemGemuse3.showOrder();
                                    itemGemuse4.showOrder();
                                    itemGemuse5.showOrder();

                                    itemObst1.showOrder();
                                    itemObst2.showOrder();
                                    itemObst3.showOrder();
                                    itemObst4.showOrder();
                                    itemObst5.showOrder();

                                    System.out.println("If you accept this liste please back to Menu then u can pay your items" +
                                            "\n\t for that please click \"n\"");
                                    String exit = scanner.next();
                                    if (exit.equalsIgnoreCase("n")) {
                                        System.out.println("you accepted your List");
                                        flag1 = false;
                                    }

                                } else if (number == 3) {
                                    customer1.showCustomerInputList();
                                    System.out.println("Do you confirm your personally account data?"+
                                            "\n\t yes or no?");
                                    confirm = scanner.nextLine();
                                    if (!(confirm.equalsIgnoreCase("yes"))){
                                        flag1 = false;
                                        flag2=false;
                                    }else {
                                        itemGemuse.showOrder();
                                        itemObst.showOrder();
                                        System.out.println("please confirm your Payment "+" y/n ");
                                        confirm = scanner.nextLine();
                                        if (confirm.equalsIgnoreCase("y")){
                                            System.out.println("your Payment was confirmed");
                                            System.out.println("your order is being prepare in 30 minutes"+
                                                    "\nwith your password you can pay your order in the customer service!"+
                                                    "\n\t and take away your stuff ");
                                            System.out.println("Thank you for order!");
                                            flag1=false;
                                        }else {
                                            System.out.println("your payment was broken"+
                                                    "\nif you want to go on with your orderList click number 3"+
                                                    "\nif you want to exit the system click number 4");
                                            System.out.println();
                                            flag1=false;
                                            flag2=false;
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case 3:
                        while (flag2) {
                            flag1 = true;
                            MenuCustomer.MenuCustomer();
                            System.out.println("please choose any number");
                            number = scanner.nextInt();
                            scanner.nextLine();
                            if (number == 5) {
                                flag2 = false;
                                flag1 = false;
                                flag = false;
                            }
                            while (flag1) {
                                if (number == 1) {
                                    MenuCustomer.itemMenu();
                                    itemNumber = scanner.nextInt();
                                    if (itemNumber == 1) {
                                        MenuCustomer.VegetableMenu();
                                        int number1 = scanner.nextInt();
                                        switch (number1) {
                                            case 1:
                                                itemName = SelectItemList.selectedNameVegetable(number1);
                                                number2 = ScannerIssue.valueItem(scanner, itemName);
                                                totalValueGramGemuse1 = itemGemuse1.addSelectedItem(totalValueGramGemuse1, number1, number2, number2);
                                                break;
                                            case 2:
                                                itemName = SelectItemList.selectedNameVegetable(number1);
                                                number2 = ScannerIssue.valueItem(scanner, itemName);
                                                totalValueGramGemuse2 = itemGemuse2.addSelectedItem(totalValueGramGemuse2, number1, number2, number2);
                                                break;
                                            case 3:
                                                itemName = SelectItemList.selectedNameVegetable(number1);
                                                number2 = ScannerIssue.valueItem(scanner, itemName);
                                                totalValueGramGemuse3 = itemGemuse3.addSelectedItem(totalValueGramGemuse3, number1, number2, number2);
                                                break;
                                            case 4:
                                                itemName = SelectItemList.selectedNameVegetable(number1);
                                                number2 = ScannerIssue.valueItem(scanner, itemName);
                                                totalValueGramGemuse4 = itemGemuse4.addSelectedItem(totalValueGramGemuse4, number1, number2, number2);
                                                break;
                                            case 5:
                                                itemName = SelectItemList.selectedNameVegetable(number1);
                                                number2 = ScannerIssue.valueItem(scanner, itemName);
                                                totalValueGramGemuse5 = itemGemuse5.addSelectedItem(totalValueGramGemuse5, number1, number2, number2);
                                                break;
                                            case 6:
                                                break;
                                        }
                                    } else if (itemNumber == 2) {
                                        MenuCustomer.FruitMenu();
                                        int numberFruit = scanner.nextInt();
                                        switch (numberFruit) {
                                            case 1:
                                                itemName = SelectItemList.selectedNameFruit(numberFruit);
                                                number2 = ScannerIssue.valueItem(scanner, itemName);
                                                totalValueGramObst1 = itemObst1.addSelectedItem(totalValueGramObst1, numberFruit, number2, number2);
                                                break;
                                            case 2:
                                                itemName = SelectItemList.selectedNameFruit(numberFruit);
                                                number2 = ScannerIssue.valueItem(scanner, itemName);
                                                totalValueGramObst2 = itemObst2.addSelectedItem(totalValueGramObst2, numberFruit, number2, number2);
                                                break;
                                            case 3:
                                                itemName = SelectItemList.selectedNameFruit(numberFruit);
                                                number2 = ScannerIssue.valueItem(scanner, itemName);
                                                totalValueGramObst3 = itemObst3.addSelectedItem(totalValueGramObst3, numberFruit, number2, number2);
                                                break;
                                            case 4:
                                                itemName = SelectItemList.selectedNameFruit(numberFruit);
                                                number2 = ScannerIssue.valueItem(scanner, itemName);
                                                totalValueGramObst4 = itemObst4.addSelectedItem(totalValueGramObst4, numberFruit, number2, number2);
                                                break;
                                            case 5:
                                                itemName = SelectItemList.selectedNameFruit(numberFruit);
                                                number2 = ScannerIssue.valueItem(scanner, itemName);
                                                totalValueGramObst5 = itemObst5.addSelectedItem(totalValueGramObst5, numberFruit, number2, number2);
                                                break;
                                            case 6:
                                                break;
                                        }
                                    } else if (itemNumber == 3) {
                                        break;
                                    }
                                } else if (number == 2) {
                                    itemGemuse1.showOrder();
                                    itemGemuse2.showOrder();
                                    itemGemuse3.showOrder();
                                    itemGemuse4.showOrder();
                                    itemGemuse5.showOrder();

                                    itemObst1.showOrder();
                                    itemObst2.showOrder();
                                    itemObst3.showOrder();
                                    itemObst4.showOrder();
                                    itemObst5.showOrder();

                                    System.out.println("If you accept this liste please back to Menu then u can pay your items" +
                                            "\n\t for that please click \"n\"");
                                    String exit = scanner.next();
                                    if (exit.equalsIgnoreCase("n")) {
                                        System.out.println("you accepted your List");
                                        flag1 = false;
                                    }

                                } else if (number == 3) {
                                    customer.showMemberInputList();
                                    customer1.showCustomerInputList();
                                    System.out.println("Do you confirm your personally account data?"+
                                            "\n\t yes or no?");
                                    confirm = scanner.nextLine();
                                    if (!(confirm.equalsIgnoreCase("yes"))){
                                        flag1 = false;
                                        flag2=false;
                                    }else {
                                        itemGemuse.showOrder();
                                        itemObst.showOrder();
                                        System.out.println("please confirm your Payment "+" y/n ");
                                        confirm = scanner.nextLine();
                                        if (confirm.equalsIgnoreCase("y")){
                                            System.out.println("your Payment was confirmed");
                                            System.out.println("your order is being prepare in 30 minutes"+
                                                    "\nwith your password you can pay your order in the customer service!"+
                                                    "\n\t and take away your stuff ");
                                            System.out.println("Thank you for order!");
                                            flag1=false;
                                        }else {
                                            System.out.println("your payment was broken"+
                                                    "\nif you want to go on with your orderList click number 3"+
                                                    "\nif you want to exit the system click number 4");
                                            System.out.println();
                                            flag1=false;
                                            flag2=false;
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case 4:
                        flag = false;
                        break;

                    case 5:
                        boolean rightOrFalse1;
                        boolean flagPssword = true;
                        System.out.println("Are you member? Y/N");
                        String member = scanner.next();
                        String exit ;
                        while (flagPssword){
                            System.out.println("If you wanna change your data please write your first password "+
                                    "than you can change only your name, address, Card number with your first right password. ");
                            System.out.println("first password:");
                            password = scanner.nextInt();
                            scanner.nextLine();
                            if (member.equalsIgnoreCase("y")){
                                System.out.println("new name:");
                                name= scanner.next();
                                System.out.println("new card number: ");
                                cardnumber=scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("new address: ");
                                adress = scanner.nextLine();
                                rightOrFalse1 = customer.changeAccountDataWithRegistration(password,name,adress,cardnumber);
                            }else {
                                System.out.println("new name:");
                                name= scanner.next();
                                rightOrFalse1 = customer1.changeAccountDataWithoutRegistration(password,name);
                            }
                            // hangi customer sinifi girecek belirlemem lazim
                            if (!rightOrFalse1){
                                System.out.println("please write your password correct!!!");
                                System.out.println("Do you wanna try again? click y"+
                                        "\nexit : click n");
                                exit=scanner.next();
                                if (exit.equalsIgnoreCase("n")){
                                    flagPssword = false;
                                }
                            }else {
                                System.out.println("your Account data was changed. thank you");
                                flagPssword = false;// right password
                            }
                        }
                        break;
                }
            }
        }
    }

