import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.pokeTamagochi.PokeService.PokeService;
import org.pokeTamagochi.Pokemon;
import org.pokeTamagochi.RestController.PokeTamagochiRest;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = PokeTamagochiRest.class)
public class PokeTamagochiRestTest {
    private final PokeTamagochiRest pokeTamagochiRest = new PokeTamagochiRest();
    @Test
    public void devolverTest(){
        PokeService pokeService = new PokeService();
        pokeService.guardarPokemon = new Pokemon(0, "x", "y", 5);
        System.out.println(pokeService.guardarPokemon);
        Assertions.assertNotNull(pokeService.guardarPokemon);
    }
}
