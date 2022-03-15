package br.com.copa;

import java.util.ArrayList;
import java.util.List;

public class  Selecao {

	private String pais;
	private int titulosMundiais; 
	private int titulosContinentais; 
	private List<Jogador> jogadores;
	private String tecnico;
	
	public Selecao(String pais, int titulosMundiais, int titulosContinentais, String tecnico, ArrayList<Jogador> jogadores) {
		this.pais = pais;
		this.titulosMundiais = titulosMundiais;
		this.titulosContinentais = titulosContinentais;
		this.tecnico = tecnico;
		this.jogadores =  jogadores;
	}

	public String getPais() {
		return pais;
	}

	public int getTitulosMundiais() {
		return titulosMundiais;
	}

	public int getTitulosContinentais() {
		return titulosContinentais;
	}

	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public String getTecnico() {
		return tecnico;
	}
	
	@Override
	public String toString() {
		return String.format("País: %s, Títulos Mundiais: %d, Títulos Continentais: %d, Técnico: %s, \nElenco: \n%s", pais,titulosMundiais, titulosContinentais, tecnico, jogadores);
	}
	
	
	
}
