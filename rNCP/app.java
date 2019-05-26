package rNCP;

public class app {

	public static void main(String[] args) {
		
		Naczynia naczynie = new Naczynia("Zielone","Duże") {
		};

		Talerz talerz = new Talerz("biały", "mały");
		Kubek kubek = new Kubek("Czarny", "Średni");
		
		naczynie.jem();
		naczynie.pije();
		talerz.jem();
		talerz.brudze();
		kubek.brudze();
		talerz.zmywam();
		kubek.zmywam();
		naczynie.zmywam();
		talerz.zmywam();
		talerz.dolejZupe();
		kubek.dolejSok();
		
		
	}

}
