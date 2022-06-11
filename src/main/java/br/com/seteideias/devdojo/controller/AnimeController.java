package br.com.seteideias.devdojo.controller;

import br.com.seteideias.devdojo.domain.Anime;
import br.com.seteideias.devdojo.service.AnimeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class AnimeController {
    private final AnimeService animeService;

    @PostMapping("/novo")
    public Anime novo(Anime anime) {
        Anime anime1 = new Anime(1L,"Jaspion");
        return animeService.save(anime1);
    }

    @PostMapping("/cad")
    public String cadastrarAnime () {
        Anime anime1 = new Anime(1L,"Jaspion");
        return anime1.getName();
    }

    @GetMapping
    public List<Anime> listAll() {
        return animeService.listarTodos();
    }

}
