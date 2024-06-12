package projetoIphone;

public class ReprodutorMusical {
	private String musicaAtual;
	
	public void tocar() {
		if (musicaAtual != null) {
			System.out.println("Tocando: " + musicaAtual);
		}else {
			System.out.println("Nenhuma música selecionada.");
		}
	}
	
	public void pausar() {
		if(musicaAtual != null) {
			System.out.println("Música pausada: " + musicaAtual);
		}else {
			System.out.println("Nenhuma música para pausar.");
		}
	}
	
	public void selecionarMusica(String musica) {
		musicaAtual = musica;
		System.out.println("Musica selecionada: " + musicaAtual);
	}
}
