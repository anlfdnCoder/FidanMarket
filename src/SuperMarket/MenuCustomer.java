package SuperMarket;

    public class MenuCustomer {
        public static void MenuCustomer(){
            System.out.println("Welcome to fidan Market"+
                    "\n\t1.List of Item"+
                    "\n\t2.List of Order"+
                    "\n\t3.Payment"+
                    "\n\t4.ComplaintBox"+
                    "\n\t5.Exit");
        }
        public static void itemMenu(){
            System.out.println("please choose any item category"+
                    "\n1.Vegetable"+
                    "\n2.Fruit"+
                    "\n3.Backto the Main-Menu");
        }
        public static void VegetableMenu(){
            System.out.println("please choose any vegetable item"+
                    "\n\t1.\"Potato\" + per kilo costs 1.40 Euro"+
                    "\n\t2.\"tomato\"+  per kilo costs 1.90 Euro"+
                    "\n\t3.\"celeriac\" per piece costs 1.60 Euro"+
                    "\n\t4.\"carrot\"   per kilo costs 1.20 Euro"+
                    "\n\t5.\"spinach\"  per kilo costs 1.60 Euro"+
                    "\n6.Back to the item-Menu");
        }
        public static void FruitMenu(){
            System.out.println("please choose any vegetable item"+
                    "\n\t1.\"Apple\" per kilo costs 1.40 Euro"+
                    "\n\t2.\"Grape\" per kilo  costs 2.20 Euro"+
                    "\n\t3.\"Kiwi\" per piece costs 1.00 Euro"+
                    "\n\t4.\"mandarin-orange\" per kilo costs 1.30 Euro"+
                    "\n\t5.\"strawberry\" per box(150 gram) costs 2.60 Euro"+
                    "\n6.Back to the item-Menu");
        }
    }

