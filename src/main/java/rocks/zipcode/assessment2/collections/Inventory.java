package rocks.zipcode.assessment2.collections;

import java.util.*;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {

    SortedMap<String, Integer> inventory = new TreeMap<String, Integer>();
    List<String> stringss;
   // Integer count = 0;
    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
        this.stringss = strings;
    }




    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        this.stringss = new ArrayList<>();

    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
      //  ++count;
      //  inventory.put(count, item);

            if (inventory.containsKey(item)) {
                Integer count = inventory.get(item);
                inventory.replace(item,count+1);
            } else {
                inventory.put(item, 1);
            }

    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {

//        ArrayList<Integer> answer = new ArrayList<Integer>();
//        Iterator<String> itr = inventory.keySet().iterator();
//
//        while(itr.hasNext()){
//            String key = itr.next();
//            Integer val = inventory.get(key);
//            if(val.equals(item)){
//                inventory.remove(key);
//
//            }
//        }
        inventory.remove(item);



    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
       // return count;
        Integer ans = 0;
        if(inventory.containsKey(item)){
            ans = inventory.get(item);
        }
        return ans;
    }
}
