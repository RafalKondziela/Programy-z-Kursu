package infinityTable;

public class app  {

	
	public static void main(String[] args) {

		String ala = new String("ala");
		String abc = new String("abcsclc,,grgrg");
		
		TabObject tab = new TabObject();
		tab.append(ala);
		tab.append(abc);
		tab.append(ala);
	
		tab.showTab();
		
		tab.append(abc, 2);
		tab.append(abc, 0);
		
		
		tab.showTab();
		
		
		
	}
	

}
