package iphone.aparelhoTelefonico;

import java.util.*;

public class Agenda {
	
	// Instanciando a Agenda Telefônica
	private List<Contato> agendaTelefonica;
	
	// Constructor
	public Agenda() {
		this.agendaTelefonica = new ArrayList<>();
	}

	// Adicionar Contato
	public void adicionarContato(String nome, int numero, String email) {
		Contato contato = new Contato(nome, numero, email);
		this.agendaTelefonica.add(contato);
	}
	
	// Atualizar Contato
	public void atualizarNomeContato(String nome, String novoNome, int novoNumero, String novoEmail) {
		Contato contatoAtualizado = null;
		if(!agendaTelefonica.isEmpty()) {
			for(Contato c : agendaTelefonica) {
				if(c.getNome().equalsIgnoreCase(nome)) {
					c.setNome(novoNome);
					c.setNumero(novoNumero);
					c.setEmail(novoEmail);
					contatoAtualizado = c;
				}
			}
		}
	}
	
	// Remover Contato
	public void removerContato(String nome) {
		List<Contato> contatoParaRemover = new ArrayList<>();
		if(!agendaTelefonica.isEmpty()) {
			for(Contato c : agendaTelefonica) {
				if(c.getNome().equalsIgnoreCase(nome)) {
					contatoParaRemover.add(c);
				}
			}
			agendaTelefonica.removeAll(contatoParaRemover);
		} else {
			System.out.println("A agenda está vazia!");
		}
	}
	
	// Listar Contatos
	public void listarContatos() {
		if(!agendaTelefonica.isEmpty()) {
			System.out.println(this.agendaTelefonica);
		} else {
			System.out.println("A agenda está vazia!");
		}
	}
	
	// Pesquisar Contato
	public List<Contato> pesquisarContatoPorNome(String nome) {
		List<Contato> encontrarContato = new ArrayList<>();
		if(!agendaTelefonica.isEmpty()) {
			for(Contato c : agendaTelefonica) {
				if(c.getNome().equalsIgnoreCase(nome)) {
					encontrarContato.add(c);
				}
			}
			return encontrarContato;
		} else {
			throw new RuntimeException("A agenda está vazia!");
		}
	}

}
