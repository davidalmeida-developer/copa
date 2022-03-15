package br.com.copa;

public class Jogador {

	private String nome;
	private int idade;
	private String clube;
	private String posicao;
	
	public  Jogador(String nome, int idade, String clube, Posicao posicao) {
		this.nome = nome;
		this.idade = idade;
		this.clube = clube;
		this.posicao= posicao.retornaPosicao();
	}
	
	public void listaDeJogadores(){
		
	}
	
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
	
	public String getClube() {
		return clube;
	}
	
	
	
	public String getPosicao() {
		return posicao;
	}
	
	@Override
	public String toString() {
		return String.format("Nome: %s, Idade: %d, Clube: %s, Posição: %s\n", nome,idade,clube,posicao);
	}
	










}
