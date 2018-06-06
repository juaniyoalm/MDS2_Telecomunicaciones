package com.example.telecomunicaciones;

import com.vaadin.ui.Button;

public class Cibernauta extends V_Cibernauta {
	
	public Cibernauta() {
		
		Button of1 = new Button("Oferta 1");
		of1.addStyleName("ofertaBtn");
		Button of2 = new Button("Oferta 2");
		of2.addStyleName("ofertaBtn");
		Button of3 = new Button("Oferta 3");
		of3.addStyleName("ofertaBtn");
		Button of4 = new Button("Oferta 4");
		of4.addStyleName("ofertaBtn");
		Button of5 = new Button("Oferta 5");
		of5.addStyleName("ofertaBtn");
		Button of6 = new Button("Oferta 6");
		of6.addStyleName("ofertaBtn");
		
		horPanel1.addComponent(of1);
		horPanel1.addComponent(of2);
		horPanel1.addComponent(of3);
		
		horPanel2.addComponent(of4);
		horPanel2.addComponent(of5);
		horPanel2.addComponent(of6);

	}

}
