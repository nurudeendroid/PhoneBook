package PhoneBook;
import java.util.Map;
import java.util.HashMap;
/**
 * Created by nurudeenlawal on 5/16/16.
 */
public class PhoneBook {
    Map<String, Entry>entryMap;

    public PhoneBook(){
        entryMap = new HashMap<String, Entry>();
    }
    public void addEntry( String name, Entry newEntry){
        entryMap.put(name,newEntry);
    }
    public void removeEntry(String name){
        entryMap.remove(name);
    }
    public Entry  lookupEntry(String name){
        return entryMap.get(name);
    }
    public String reverseLookup(String number){
        return null;
    }
}
