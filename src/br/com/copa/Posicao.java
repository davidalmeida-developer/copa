package br.com.copa;

public enum Posicao {

	Goleiro  {
		@Override
		public String retornaPosicao() {
			return "Goleiro";
		}
	},
	Zagueiro  {
		@Override
		public String retornaPosicao() {
			// TODO Auto-generated method stub
			return "Zagueiro";
		}
	},
	Lateral_Direito  {
		@Override
		public String retornaPosicao() {
			// TODO Auto-generated method stub
			return "Lateral Direito";
		}
	},
	Lateral_Esquerdo  {
		@Override
		public String retornaPosicao() {
			// TODO Auto-generated method stub
			return "Lateral Esquerdo";
		}
	},
	Volante  {
		@Override
		public String retornaPosicao() {
			// TODO Auto-generated method stub
			return "Volante";
		}
	},
	Meio_Campo  {
		@Override
		public String retornaPosicao() {
			// TODO Auto-generated method stub
			return "Meio-Campo";
		}
	},
	Atacante{
		@Override
		public String retornaPosicao() {
			// TODO Auto-generated method stub
			return "Atacante";
		}
	};
	
		
 public abstract String retornaPosicao();  
}

