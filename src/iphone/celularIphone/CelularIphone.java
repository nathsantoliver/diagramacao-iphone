package iphone.celularIphone;

import iphone.aparelhoTelefonico.AparelhoTelefonico;
import iphone.navegadorInternet.NavegadorInternet;
import iphone.reprodutorMusical.ReprodutorMusical;

public class CelularIphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {
	// MÉTODOS DO APARELHO TELEFÔNICO
	@Override
	public void ligar() {
		System.out.println("FAZENDO LIGAÇÃO NO iPHONE!!!");
	}

	@Override
	public void atender() {
		System.out.println("ATENDENDO LIGAÇÃO NO iPHONE!!!");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ DO iPHONE!!!");
	}

	// MÉTODOS DO APARELHO MUSICAL
	@Override
	public void tocar() {
		System.out.println("TOCANDO MUSICA NO iPHONE!!!");
	}

	@Override
	public void pausar() {
		System.out.println("PAUSANDO MUSICA NO iPHONE!!!");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("SELECIONANDO MUSICA DA PLAYLIST DO iPHONE!!!");
	}

	// MÉTODOS DO NAVEGADOR DE INTERNET
	@Override
	public void exibirPagina() {
		System.out.println("EXIBINDO PÁGINA DA INTERNET NO iPHONE!!!");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO NOVA ABA NO NAVEGADOR DO iPHONE!!!");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PÁGINA DA INTERNET NO iPHONE!!!");
	}

}
