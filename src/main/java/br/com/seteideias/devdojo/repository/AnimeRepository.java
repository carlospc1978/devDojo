package br.com.seteideias.devdojo.repository;

import br.com.seteideias.devdojo.domain.Anime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimeRepository extends JpaRepository<Anime, Long> {
}
