import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BunTest {
    private final String name;
    private final float price;

    public BunTest(String name, float price){
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters
    public static Object[][] Data(){
        return new Object[][] {
                {"white bun", 77F},
                {"bun from HELL", 666F}
        };
    }
    @Test
    public void checkBunNameAndPriceTest(){
        Bun bun = new Bun(name, price);
        String expectedName = name;
        float expectedPrice = price;

        assertEquals("Название булочки не совпадает.", expectedName, bun.getName());
        assertEquals("Цена булочки не совпадает.", expectedPrice, bun.getPrice(), 0);
    }
}

