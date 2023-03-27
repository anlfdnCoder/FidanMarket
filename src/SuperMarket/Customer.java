package SuperMarket;

import java.util.ArrayList;
import java.util.List;

    public class Customer  implements Sale{

        private String name;
        private int password;

        private int cardNumber;

        private String adress;

        public List<Customer> memberList;

        public List<Customer>customerList;

        public Customer(String name, int password, int cardNumber, String adress) {
            this.name = name;
            this.password = password;
            this.cardNumber = cardNumber;
            this.adress = adress;
            this.memberList = new ArrayList<>();
        }

        public Customer(String name, int password) {
            this.name = name;
            this.password = password;
            this.customerList = new ArrayList<>();
        }

        public Customer() {
        }

        public String getName() {
            return name;
        }

        public int getPassword() {
            return password;
        }

        public int getCardNumber() {
            return cardNumber;
        }

        public String getAdress() {
            return adress;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setCardNumber(int cardNumber) {
            this.cardNumber = cardNumber;
        }

        public void setAdress(String adress) {
            this.adress = adress;
        }

        private boolean checkNameInTheList(String name){
            for (var each:this.memberList) {
                if (each.getName().equalsIgnoreCase(name)){
                    return false;
                }
            }
            return true;
        }
        private boolean checkNameInTheListWithoutMember(String name){
            for (var each:this.customerList) {
                if (each.getName().equalsIgnoreCase(name)){
                    return false;
                }
            }
            return true;
        }

        public void addMember (String name, int password, int cardNumber, String adress){
            if (!(checkNameInTheList(name))){
                System.out.println("this name was added");
            }else {
                this.memberList.add(new Customer(name,password,cardNumber,adress));
                System.out.println("your name was added");
                System.out.println("you have a 10% discount.");
            }
        }
        public void addCustomer(String name, int password){
            if (!(checkNameInTheListWithoutMember(name))){
                System.out.println("this name was added");
            }else {
                this.customerList.add(new Customer(name,password));
                System.out.println("your name was added");
            }

        }

        @Override
        public void sale(int password) {
            double number = 0;
            for (var each : this.memberList) {
                if (each.getPassword() == password){
                    System.out.println("Sie haben %10 rabatt auf alle Produkten");
                }
            }
        }

        @Override
        public void showMemberInputList() {
            for (int i = 0; i < this.memberList.size(); i++) {
                System.out.println("list of your account overview"+
                        "\n\t\"name\": "+this.memberList.get(i).getName()+
                        "\n\t\"password\":"+this.memberList.get(i).getPassword()+
                        "\n\t\"Card number\": "+this.memberList.get(i).getCardNumber()+
                        "\n\t\"Adress\": "+this.memberList.get(i).getAdress());
            }
        }

        @Override
        public void showCustomerInputList() {
            for (int i = 0; i < this.customerList.size(); i++) {
                System.out.println("list of your account overview"+
                        "\n\t\"name\": "+this.customerList.get(i).getName()+
                        "\n\t\"password\":"+this.customerList.get(i).getPassword());

            }
        }

        @Override
        public boolean changeAccountDataWithoutRegistration(int password,String name) {
            for (int i = 0; i < this.customerList.size(); i++) {
                if (this.customerList.get(i).getPassword()==password){
                    this.customerList.get(i).setName(name);
                    return true;
                }
            }
            return false;

        }

        @Override
        public boolean changeAccountDataWithRegistration(int password,String name,String adress,int cardNumber) {
            for (int i = 0; i <this.memberList.size() ; i++) {
                if (this.memberList.get(i).getPassword()==password){
                    this.memberList.get(i).setName(name);
                    this.memberList.get(i).setAdress(adress);
                    this.memberList.get(i).setCardNumber(cardNumber);
                    return true;
                }
            }
            System.out.println("please write your password correct");
            return false;
        }
    }

