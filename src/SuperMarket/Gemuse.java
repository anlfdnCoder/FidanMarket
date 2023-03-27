package SuperMarket;

import java.math.BigDecimal;
import java.math.RoundingMode;

    public class Gemuse extends Item{

        public Gemuse(String name, double price, int gram) {
            super(name,  price, gram);
        }

        public Gemuse() {
        }



        @Override
        public void addItem(String name, double price, int gram) {
            this.marketList.add(new Gemuse(name,price, gram ));
            System.out.println("it is added");
        }

        @Override
        public double gramChoose( double gram) {

            double summary=0;
            if (gram>0){
                summary = (((this.price()-0.2)*(gram/1000)));
            }
            BigDecimal bd = new BigDecimal(summary).setScale(2, RoundingMode.HALF_UP);
            double newSummary = bd.doubleValue();

            return  newSummary;

        }

        @Override
        public int addSelectedItem( int totalValueGram,int number, int price, int gram) {
            String name =  SelectItemList.selectedNameVegetable(number);
            if (totalValueGram>0){
                if ((!(gram>totalValueGram))){
                    totalValueGram-=gram;
                    double summary = gramChoose(price);
//                String name =  SelectItemList.selectedNameVegetable(number);
                    this.orderList.add(new Gemuse(name,summary,gram));
                    System.out.println("your item is added in your order List");
                    return totalValueGram;
                }else {
                    System.out.println("we have total "+ totalValueGram+" gram of "+name );
                    System.out.println("try again");
                    return totalValueGram;
                }
            }else {
                System.out.println("this item is not any more in the storage");
                System.out.println("try again");
                return totalValueGram;

            }

        }

        @Override
        public double gramChooseWithoutDiscount(double gram) {
            double summary=0;
            if (gram>0){
                summary = (((this.price())*(gram/1000)));
            }
            BigDecimal bd = new BigDecimal(summary).setScale(2, RoundingMode.HALF_UP);
            double newSummary = bd.doubleValue();

            return  newSummary;
        }

        @Override
        public int addSelectedItemWithoutDiscount(int totalValueGram, int itemNumber, int price, int gram) {
            String name = SelectItemList.selectedNameVegetable(itemNumber);
            if (totalValueGram > 0) {
                if ((!(gram > totalValueGram))) {
                    totalValueGram -= gram;
                    double summary = gramChoose(price);
//                String name =  SelectItemList.selectedNameVegetable(number);
                    this.orderList.add(new Gemuse(name, summary, gram));
                    System.out.println("your item is added in your order List");
                    return totalValueGram;
                } else {
                    System.out.println("we have total " + totalValueGram + " gram of " + name);
                    System.out.println("try again");
                    return totalValueGram;
                }
            } else {
                System.out.println("this item is not any more in the storage");
                System.out.println("try again");
                return totalValueGram;
            }
        }

        @Override
        public void showOrder() {
            for (int i = 0; i < this.orderList.size(); i++) {
                System.out.println("your vegetable list: "+
                        "\n\t"+(i+1)+"- "+this.orderList.get(i).getGram()+" gram "+this.orderList.get(i).getName());
                if (this.orderList.get(i).price()<1.00){
                    System.out.println("\n\t\t"+"price: "+this.orderList.get(i).price()*100+" cent");
                }else {
                    System.out.println("\n\t\t"+"price: "+(this.orderList.get(i).price())+" euro");
                }

            }
        }
    }
