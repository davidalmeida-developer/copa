package br.com.copa;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JogadorTest {

	public static void main(String[] args) throws IOException {
		
		List<Jogador> jogadores = new ArrayList<Jogador>();
		
		Jogador jogador1 = new Jogador("Alisson Backer", 29, "Liverpool", Posicao.Goleiro);
		jogadores.add(jogador1);
		Jogador jogador2 = new Jogador("Daniel Alves", 38, "Barcelona", Posicao.Lateral_Direito);
		jogadores.add(jogador2);
		Jogador jogador3 = new Jogador("Thiago Silva", 35, "Chelsea", Posicao.Zagueiro);
		jogadores.add(jogador3);
		Jogador jogador4 = new Jogador("Marquinhos", 31, "Paris Saint Germain", Posicao.Zagueiro);
		jogadores.add(jogador4);
		Jogador jogador5 = new Jogador("Arana", 24, "Atlético Mineiro", Posicao.Lateral_Esquerdo);
		jogadores.add(jogador5);
		Jogador jogador6 = new Jogador("Casemiro", 30, "Real Madrid", Posicao.Volante);
		jogadores.add(jogador6);
		Jogador jogador7 = new Jogador("Fred", 26, "Manchester United", Posicao.Volante);
		jogadores.add(jogador7);
		Jogador jogador8 = new Jogador("Phillipe Coutinho", 30, "Aston Villa", Posicao.Meio_Campo);
		jogadores.add(jogador8);
		Jogador jogador9 = new Jogador("Neymar Jr", 30, "Paris Saint Germain", Posicao.Atacante);
		jogadores.add(jogador9);
		Jogador jogador10 = new Jogador("Vinicius Jr", 23, "Real Madrid", Posicao.Atacante);
		jogadores.add(jogador10);
		Jogador jogador11 = new Jogador("Matheus Cunha", 23, "Atlético de Madrid", Posicao.Atacante);
		jogadores.add(jogador11);

		Selecao brazil = new Selecao("Brazil", 5, 7, "Tite", (ArrayList<Jogador>) jogadores);
		
		brazil.getJogadores().forEach(b -> System.out.println(b));
		
		BufferedWriter  bw = new BufferedWriter(new  FileWriter("Brazil.json"));
	
		bw.write(brazil.toString());
		bw.close();
		

	}
}
