package org.generation.blogPessoal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.generation.blogPessoal.model.Usuario;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Optional<Usuario> findByUsuario(String usuario);
	public Optional<Usuario> findByNome(String nome);
	
	public List<Usuario> findAllByNomeContainingIgnoreCase(String nome);

	}
	