package projetoIphone;

public class Iphone {

	public static void main(String[] args) {
		
		// Testando ReprodutorMusical
		ReprodutorMusical reprodutor = new ReprodutorMusical();
		reprodutor.selecionarMusica("Música Favorita.");
		reprodutor.tocar();
		reprodutor.pausar();
		
		System.out.println(" ");
		
		// Testando NavegadorInternet
		NavegadorInternet navegador = new NavegadorInternet();
		navegador.exibirPagina("www.google.com");
		navegador.adicionarAba();
		navegador.atualizarPagina();
		
		System.out.println(" ");
		
		//Testando AparelhoTelefonico
		AparelhoTelefonico telefone = new AparelhoTelefonico();
		telefone.ligar("99 99999-9999");
		telefone.atender();
		telefone.iniciarCorreioVoz();
	}
	
}
