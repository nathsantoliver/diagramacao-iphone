package iphone.reprodutorMusical;

public class Ipod implements ReprodutorMusical {

	@Override
	public void tocar() {
		System.out.println("TOCANDO MUSICA NO iPOD!!!");
	}

	@Override
	public void pausar() {
		System.out.println("PAUSANDO MUSICA NO iPOD!!!");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("SELECIONANDO MUSICA NO iPOD!!!");
	}

}
