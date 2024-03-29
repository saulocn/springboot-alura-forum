package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.forum.modelo.Resposta;

public class RespostaDto {
	private Long id;
	private String mensagem;
	private LocalDateTime dataCriacao;
	private String nomeAutor;

	public RespostaDto(Resposta resposta) {
		this.id = resposta.getId();
		this.mensagem = resposta.getMensagem();
		this.dataCriacao = resposta.getDataCriacao();
		this.nomeAutor = resposta.getAutor().getNome();
	}

	public Long getId() {
		return id;
	}

	public String getMensagem() {
		return mensagem;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public static Collection<RespostaDto> converter(List<Resposta> respostas) {
		return respostas.stream().map(RespostaDto::new).collect(Collectors.toList());
	}

}
