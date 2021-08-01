import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.pokeTamagochi.RestController.PokeTamagochiRest;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = PokeTamagochiRest.class)
public class PokeTamagochiRestTest {
    private final PokeTamagochiRest pokeTamagochiRest = new PokeTamagochiRest();
    @Test
    public void initTest(){
        System.out.println(pokeTamagochiRest.testReturnPokemon());
        Assertions.assertNotNull(pokeTamagochiRest.testReturnPokemon());
    }
}
