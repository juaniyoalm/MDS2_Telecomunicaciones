package com.example.telecomunicaciones;

import com.vaadin.ui.UI;

public class CabeceraCibernauta extends V_CabeceraCibernauta {
	
	public CabeceraCibernauta() {
		accesoBtn.addClickListener(event -> {
			Login subLogin = new Login();

			// Set window position.
			subLogin.setPositionX(940);
			subLogin.setPositionY(120);
			
			UI.getCurrent().addWindow(subLogin);
		});
		
		llamadaBtn.addClickListener(event -> {
			TeLLamamos subLogin = new TeLLamamos();

			// Set window position.
			subLogin.setPositionX(940);
			subLogin.setPositionY(120);
			
			UI.getCurrent().addWindow(subLogin);
		});
	}

}
