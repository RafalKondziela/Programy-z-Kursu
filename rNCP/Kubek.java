package rNCP;

public class Kubek extends Naczynia implements Dolewanie {
	
	
	public Kubek(String kolor, String rozmiar) {
		super(kolor,rozmiar);
	}
	
	
	@Override
		public void pije() {
		
		System.out.println("Pije z " + kolor + " " + rozmiar + " kubek");
	}
	
	@Override
	public void brudze() {
		czyBrudny = true;
		System.out.println("Porudziłem " + kolor + " " + rozmiar + " kubek");
	}


	@Override
	public void dolejZupe() {
		System.out.println("Dolewam zupe do kubka");
		
	}

	@Override
	public void dolejSok() {
		System.out.println("Dolewam sok do kubka");
		
	}
}
