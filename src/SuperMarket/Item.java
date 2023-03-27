package SuperMarket;

import java.util.ArrayList;
import java.util.List;
    public abstract class Item {
        private String name;


        protected double price;

        protected int gram;

        public List<Item> marketList;
        public List<Item>orderList;

        public Item(String name, double price, int gram) {
            this.name = name;
            this.price = price;
            this.gram = gram;
            this.marketList= new ArrayList<>();
            this.orderList = new ArrayList<>();
        }

        public Item() {
        }

        public String getName() {
            return name;
        }



        protected double price(){
            return this.price;
        }

        public int getGram() {
            return gram;
        }

        public abstract void addItem(String name, double price, int gram);

        @Override
        public String toString() {
            return "Item{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }

        public abstract double gramChoose( double gram);
        public abstract double gramChooseWithoutDiscount(double gram);
        public abstract int addSelectedItem(int totalValueOfItem,int itemNumber, int price, int gram);
        public abstract int addSelectedItemWithoutDiscount(int totalValueOfItem,int itemNumber, int price, int gram);

        public abstract void showOrder();


    }

