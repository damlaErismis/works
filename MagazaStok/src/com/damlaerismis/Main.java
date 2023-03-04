package com.damlaerismis;

public class Main {

	public static void main(String[] args) {

	CocukGiyim cocukGiyim = new CocukGiyim("pantolon", "small" , 150, 100);
	CocukGiyim cocukGiyim1 = new CocukGiyim("pantolon", "medium" , 150, 100);
	CocukGiyim cocukGiyim2 = new CocukGiyim("pantolon", "large" , 150, 100);
	CocukGiyim cocukGiyim3 = new CocukGiyim("pantolon", "xlarge" , 150, 100);
	CocukGiyim cocukGiyim4 = new CocukGiyim("gomlek", "small" , 150, 50);
	CocukGiyim cocukGiyim5 = new CocukGiyim("gomlek", "medium" , 150, 50);
	CocukGiyim cocukGiyim6 = new CocukGiyim("gomlek", "large" , 150, 50);
	CocukGiyim cocukGiyim7 = new CocukGiyim("gomlek", "xlarge" , 150, 50);
	
	cocukGiyim.stokEkle(50);
	System.out.println(cocukGiyim.getStokSayisi());
	
	cocukGiyim3.stokAzalt(20);
	System.out.println(cocukGiyim3.getStokSayisi());
	}
	public void stokBilgisiGoster() {
		
	}

	
}
