package org.pokeTamagochi.RestController;

import org.pokeTamagochi.PokeService.PokeService;
import org.pokeTamagochi.Pokemon;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.PUT, RequestMethod.POST})
@RequestMapping("/api") //url === localhost:8080/api/

public class PokeTamagochiRest {

    private final PokeService pokeService = new PokeService();

    @GetMapping("/testReturnPokemon")

    public Pokemon testReturnPokemon(){
        return pokeService.initPokemon();
    }
}
