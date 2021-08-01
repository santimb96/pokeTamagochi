package org.pokeTamagochi.PokeService;


import org.pokeTamagochi.Pokemon;
import org.springframework.stereotype.Service;

@Service
public class PokeService {

    public Pokemon initPokemon(){
        return new Pokemon(0, "pikachu", "electrico", 1);
    }
}
