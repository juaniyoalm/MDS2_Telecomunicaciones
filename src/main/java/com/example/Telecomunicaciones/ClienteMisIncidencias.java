package com.example.Telecomunicaciones;

import com.vaadin.ui.PopupView;

public class ClienteMisIncidencias extends V_ClienteMisIncidencias {

	public ClienteMisIncidencias() {
		ClienteNuevaIncidencia ni = new ClienteNuevaIncidencia();
		PopupView pv = new PopupView(null, ni);
		pv.setStyleName("pNuevoCliente");
		this.addComponent(pv);
		
		
		nuevaIncidenciaBtn.addClickListener(event -> {
			pv.setPopupVisible(true);
		});
	}
}
