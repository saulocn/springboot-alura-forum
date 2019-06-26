package br.com.alura.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.alura.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

	List<Topico> findByTitulo(String titulo);

	List<Topico> findByCursoNome(String nomeCurso);

	List<Topico> findByCurso_Nome(String nomeCurso);

	@Query("SELECT t from Topico t where t.curso.nome like :nomeCurso")
	List<Topico> carregaPorNomeCurso(@Param("nomeCurso") String nomeCurso);

}
