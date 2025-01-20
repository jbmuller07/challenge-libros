package com.aluracursos.librosdesafio.repository;

import com.aluracursos.librosdesafio.model.Libro;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LibroRepository extends JpaRepository<Libro, Long> {

    @Query("SELECT l FROM Libro l WHERE l.language ILIKE %:language%")
    List<Libro> findByLanguage(String language);

    @Query("SELECT l FROM Libro l ORDER BY l.download_count DESC")
    List<Libro> findTop10ByOrderByDownloadCountDesc(Pageable pageable);
}
