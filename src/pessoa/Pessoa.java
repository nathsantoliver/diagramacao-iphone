package pessoa;

import iphone.celularIphone.CelularIphone;
import iphone.reprodutorMusical.Ipod;
import iphone.reprodutorMusical.ReprodutorMusical;

public class Pessoa {
	public static void main(String[] args) {
		
		CelularIphone iphoneMaria = new CelularIphone();
		ReprodutorMusical ipodJoao = new Ipod();
		
		// iPhone Maria
		iphoneMaria.ligar();
		iphoneMaria.selecionarMusica();
		iphoneMaria.tocar();
		iphoneMaria.exibirPagina();

		System.out.println("*-------------*-------------*");
		
		// iPod João
		ipodJoao.selecionarMusica();
		ipodJoao.tocar();
		ipodJoao.pausar();
	}
}
