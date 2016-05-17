package JavaPhonebookSpec;

import PhoneBook.Entry;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nurudeenlawal on 5/16/16.
 */
public class EntrySpec {
    @Test
    public void addNumberTest(){
        Entry theEntry = new Entry("Boddy Shmurda");
        theEntry.addNumber("555-333-5555");
        theEntry.addNumber("555-555-5555");
        int expectedNumberOfNumbers = 2;
        int actualNumberOfNumbers = theEntry.numberOfNumbers();
        Assert.assertEquals(expectedNumberOfNumbers,actualNumberOfNumbers);
    }
    @Test
    public void removeNumberTest(){
        Entry theEntry = new Entry("Potter The Otter");
        theEntry.addNumber("123-456-7899");
        theEntry.addNumber("987-654-3211");
        int resultBeforeDelete = theEntry.numberOfNumbers();
        theEntry.removeNumber("123-456-7899");
        int afterDelete = theEntry.numberOfNumbers();
        Assert.assertNotEquals(resultBeforeDelete,afterDelete);
    }
    @Test
    public void retrieveNumberTest(){

    }
}
