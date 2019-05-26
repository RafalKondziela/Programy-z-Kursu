package rNCP;

public class Talerz extends Naczynia implements Zmywanie,Dolewanie {
	
	
	public Talerz(String kolor, String rozmiar) {
		super(kolor,rozmiar);
	}

	@Override
	public void jem() {
		System.out.println("Jem z " + kolor + " " + rozmiar + " talerz");
	}
	@Override
	public void brudze() {
		czyBrudny = true;
		System.out.println("Porudziłem " + kolor + " " + rozmiar + " Talerz");
	}
	
	@Override
	public void zmywam() {
		if (czyBrudny == true) {
			czyBrudny = false;
			System.out.println("Umyłem talerz");
		}else System.out.println("Talerz czysty");
	}

	@Override
	public void dolejZupe() {
		System.out.println("Dolewam zupe do talerza");
		
	}

	@Override
	public void dolejSok() {
		System.out.println("Dolewam sok do talerza)");
		
	}
	
}
