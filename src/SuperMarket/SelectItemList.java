package SuperMarket;

import java.util.ArrayList;
import java.util.List;


    public class SelectItemList {
        public static String selectedNameFruit(int number){
            List<String> fruitList =new ArrayList<>(List.of("Apple","Grape","Kiwi","mandarin-orange","strawberry"));
            String name = fruitList.get((number-1));
            return name;
        }
        public static String selectedNameVegetable(int number){
            List<String> fruitList =new ArrayList<>(List.of("Potato","tomato","celeriac","carrot","spinach"));
            String name = fruitList.get((number-1));
            return name;
        }
    }

