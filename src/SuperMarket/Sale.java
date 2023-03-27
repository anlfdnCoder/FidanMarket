package SuperMarket;


    public interface Sale {
        void sale(int password);
        void showMemberInputList();
        void showCustomerInputList();
        boolean changeAccountDataWithoutRegistration(int password,String name);
        boolean changeAccountDataWithRegistration(int password,String name,String adress,int cardnumber);

    }

