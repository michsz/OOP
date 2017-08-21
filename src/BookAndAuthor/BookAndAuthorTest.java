package BookAndAuthor;


import org.junit.Assert;
import org.junit.Test;

public class BookAndAuthorTest {

    @Test
    public void authorDefaultGetNameGetEmailGetGender (){
        Author tolkien = new Author("Tolkien", "tolkien@tolkien.com", 'm');
        Assert.assertEquals("Tolkien", tolkien.getName());
        Assert.assertEquals("tolkien@tolkien.com", tolkien.getEmail());
        Assert.assertEquals(new Character('m'), tolkien.getGender());
    }

    @Test
    public void authorDefaultSetEmail (){
        Author tolkien = new Author("Tolkien", "tolkien@tolkien.com", 'm');
        tolkien.setEmail("nowyEmail@email.com");
        Assert.assertEquals("nowyEmail@email.com", tolkien.getEmail());
    }




}
