package com.iphone;

import com.iphone.resources.AparelhoTelefonico;
import com.iphone.resources.NavegadorInternet;
import com.iphone.resources.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	private String url;
	private String numero;
	private String musica;

	public Iphone() {
	}
	
	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo " + url);
		
	}

	@Override
	public void adicionarNovaAba() {
		// TODO Auto-generated method stub
		System.out.println("Adicionando nova aba");
	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		System.out.println("Atualizando página.");
	}

	@Override
	public void ligar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Ligando para o número: " + numero);
	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub
		System.out.println("Atendendo número.");
	}

	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		System.out.println("Iniciando correio de voz.");
	}

	@Override
	public void selecionarMusica(String musica) {
		// TODO Auto-generated method stub
		System.out.println("Selecionando música: " + musica);
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		System.out.println("Pausando música.");
	}

	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("Tocando música.");
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getMusica() {
		return musica;
	}

	public void setMusica(String musica) {
		this.musica = musica;
	}
}
