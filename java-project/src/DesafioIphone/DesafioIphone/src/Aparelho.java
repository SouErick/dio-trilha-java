import com.iphone.Iphone;

public class Aparelho {
	public static void main(String[] args) {
		String url = "https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/poo";
		String numero = "99999-9999";
		String musica = "Black - Pearl Jam";
		
		Iphone iphone = new Iphone(); 
		
		System.out.println("----------------");
		iphone.selecionarMusica(musica);
		iphone.tocar();
		iphone.pausar();
		
		System.out.println("----------------");
		iphone.ligar(numero);
		iphone.atender();
		iphone.iniciarCorreioVoz();
		
		System.out.println("----------------");
		iphone.exibirPagina(url);
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		
	}
}
