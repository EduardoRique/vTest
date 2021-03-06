package br.ufrn.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import br.ufrn.model.Pessoa;

@CrossOrigin("http://localhost:9595")
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
	
	Optional<Pessoa> findByEmailAndSenha(String email, String senha);
	
}
