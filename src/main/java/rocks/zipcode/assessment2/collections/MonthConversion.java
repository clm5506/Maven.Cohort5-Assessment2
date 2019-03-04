package rocks.zipcode.assessment2.collections;

import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Use a map to solve
 */
public class MonthConversion {

    SortedMap<Integer, String> monthMap = new TreeMap<Integer, String>();
    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    public void add(Integer monthNumber, String monthName) {
        monthMap.put(monthNumber, monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        return monthMap.get(monthNumber);
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public Integer getNumber(String monthName) {
        Integer ans = null;
        Iterator<Integer> itr = monthMap.keySet().iterator();

        while(itr.hasNext()){
           Integer key = itr.next();
            String val = monthMap.get(key);
            if(val.equals(monthName)) {
                ans = key;
            }
            }
        return ans;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        return monthMap.containsKey(monthNumber);
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        return monthMap.containsValue(monthName);
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return monthMap.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        monthMap.replace(monthNumber, monthName);

    }
}
