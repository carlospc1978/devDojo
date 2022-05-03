package br.com.seteideias.devdojo.service;

import br.com.seteideias.devdojo.domain.Anime;
import br.com.seteideias.devdojo.repository.AnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimeService {

    @Autowired
    private AnimeRepository animeRepository;

    public Anime save(Anime anime){
        return animeRepository.save(anime);
    }

    public List<Anime> listarTodos(){
        return animeRepository.findAll();
    }

    public void listarById(Long id){
        boolean present = animeRepository.findById(id).isPresent();
    }


}
