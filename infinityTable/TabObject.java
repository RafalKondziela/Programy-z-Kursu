package infinityTable;

public class TabObject implements Appendable {
	
	private Object[] tab;
	
	public TabObject() {
		tab = new Object[0];
	}
	@Override
	public Appendable append(Object item) {
		
		
				
		Object[] nTAb = new Object[tab.length + 1];
		
		System.arraycopy(tab, 0, nTAb, 0, tab.length);
		nTAb[nTAb.length - 1] = item;
		
		tab = nTAb;
		
		
		return this;
		
	}

	@Override
	public Appendable append(Object item, int index) {
		
		int length = tab.length;
		
		if(index <= length) {
		
			tab[index] = item;
			
		}else {
			Object[] nTAb = new Object[index];
			
			System.arraycopy(tab, 0, nTAb, 0, tab.length);
			nTAb[index] = item;
			
			tab = nTAb;
			
		}
		
		
		return this;
	}
	
	
	public void showTab() {
		
		for (int i = 0; i < tab.length ; i++) {
			System.out.println(tab[i]);
		}
	}
	
	
}

