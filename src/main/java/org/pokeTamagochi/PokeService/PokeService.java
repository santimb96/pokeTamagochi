package org.pokeTamagochi.PokeService;


import org.pokeTamagochi.Pokemon;
import org.springframework.stereotype.Service;

@Service
public class PokeService {
    public Pokemon guardarPokemon;

    public Pokemon devolverPokemon(){
        return guardarPokemon;
    }

    public void crearPokemon(int id, String nombre, String tipo, int nivel) {
    guardarPokemon = new Pokemon(id, nombre, tipo, nivel);
    }
}
