package PhoneBook;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nurudeenlawal on 5/16/16.
 */
public class Entry {
    private String name;
    List<String>numbers;

    public Entry(String name){
        this.name = name;
        numbers = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }
    public void addNumber(String newNumber){
        numbers.add(newNumber);
    }
    public void removeNumber(String numberToDelete){
        numbers.remove(numberToDelete);
    }
    public int numberOfNumbers(){
        return numbers.size();
    }

}
