package JavaPhonebookSpec;
import PhoneBook.PhoneBook;
import PhoneBook.Entry;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nurudeenlawal on 5/16/16.
 */
public class PhoneBookSpec {

    @Test
    public void lookUpEntryTest(){
        PhoneBook yellowPages = new PhoneBook();
        String expectedEntryName = "Stephan Curry";
        Entry theEntry = new Entry(expectedEntryName);
        yellowPages.addEntry(expectedEntryName, theEntry);
        String actualEntryName = yellowPages.lookupEntry(expectedEntryName).getName();
        Assert.assertTrue(expectedEntryName.equals(actualEntryName));

    }
    @Test
    public void addEntryTest(){
        PhoneBook yellowPages = new PhoneBook();
        String expectedEntryName = "Gary Vaynerchuck";
        Entry theEntry = new Entry(expectedEntryName);
        yellowPages.addEntry(expectedEntryName, theEntry);
        String actualEntryName = yellowPages.lookupEntry(expectedEntryName).getName();
        Assert.assertTrue(expectedEntryName.equals(actualEntryName));
    }
    @Test
    public void removeEntryTest(){
        PhoneBook emptyPages = new PhoneBook();
        String expectedEntryName = "Steven Marley";
        Entry theEntry = new Entry(expectedEntryName);
        emptyPages.addEntry(expectedEntryName, theEntry);
        Entry resultBeforeRemove = emptyPages.lookupEntry(expectedEntryName);
        emptyPages.removeEntry(expectedEntryName);
        Entry resultAfterRemove = emptyPages.lookupEntry(expectedEntryName);
        Assert.assertNull(resultAfterRemove);

        Assert.assertNotEquals(resultBeforeRemove,resultAfterRemove);

    }
    @Test
    public void emptyBookLookupTest(){
        PhoneBook emptyPages = new PhoneBook();
        Assert.assertNull(emptyPages.lookupEntry("Bueller"));
    }
}
