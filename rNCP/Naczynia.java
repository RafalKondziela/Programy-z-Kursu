package rNCP;

public abstract class Naczynia implements Zmywanie {

	
	public String kolor;
	public String rozmiar;
	protected boolean czyBrudny;
	
	public Naczynia(String kolor, String rozmiar) {
		this.kolor = kolor;
		this.rozmiar = rozmiar;
		czyBrudny = false;
	}
	
	
	public void jem() {
		System.out.println("Jem z " + kolor + " " + rozmiar + " naczynie");
	}
	
	public void pije() {
		System.out.println("Pije z " + kolor + " " + rozmiar + " naczynie");
		
	}
	
	public void brudze() {
		czyBrudny = true;
		System.out.println("Porudziłem " + kolor + rozmiar + " naczynie");
	}
	@Override
	public void zmywam() {
		if (czyBrudny == true) {
			czyBrudny = false;
			System.out.println("Umyłem naczynie");
		}else System.out.println("Naczynie czyste");
	}
}
