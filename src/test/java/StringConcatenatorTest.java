import com.matritellabs.utama.stringconcat.StringConcatenator;
import org.junit.Assert;
import org.junit.Test;

public class StringConcatenatorTest {

    @Test
    public void concatTest() {
        Assert.assertEquals("Majom", StringConcatenator.concat("Ma", "jom"));
    }
}
