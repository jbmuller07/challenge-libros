package com.aluracursos.librosdesafio;

import com.aluracursos.librosdesafio.principal.Principal;
import com.aluracursos.librosdesafio.repository.AutorRepository;
import com.aluracursos.librosdesafio.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibrosdesafioApplication implements CommandLineRunner {
	@Autowired
	private LibroRepository libroRepository;

	@Autowired
	private AutorRepository autorRepository;


	public static void main(String[] args) {

		SpringApplication.run(LibrosdesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(libroRepository, autorRepository);
		principal.muestraElMenu();
	}
}
