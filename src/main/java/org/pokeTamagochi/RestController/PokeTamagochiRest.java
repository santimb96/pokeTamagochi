package org.pokeTamagochi.RestController;

import org.pokeTamagochi.PokeService.PokeService;
import org.pokeTamagochi.Pokemon;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.PUT, RequestMethod.POST})

public class PokeTamagochiRest {

    private final PokeService pokeService = new PokeService();

    @RequestMapping("/api/index")
    public String formulario(){
        return "index";
    }

    @RequestMapping(value = "/api/render-pokemon", method = RequestMethod.POST)
    public String renderPokemon(
            @RequestParam int id,
            @RequestParam String nombre,
            @RequestParam String tipo,
            @RequestParam int nivel
    ){
        pokeService.crearPokemon(id, nombre, tipo, nivel);
        return "render-pokemon";
    }

    @GetMapping("/api/devolver")
    @ResponseBody
    public Pokemon devolver(){
        return pokeService.devolverPokemon();
    }
}


