package iphone.aparelhoTelefonico;

public class Phone implements AparelhoTelefonico {

	@Override
	public void ligar() {
		System.out.println("LIGANDO!!!");
	}

	@Override
	public void atender() {
		System.out.println("ATENDENDO!!!");		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ!!!");
	}

}
