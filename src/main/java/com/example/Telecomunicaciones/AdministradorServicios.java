package com.example.Telecomunicaciones;

import com.vaadin.ui.PopupView;

public class AdministradorServicios extends V_AdministradorServicios {

	public AdministradorServicios() {
		
		AdministradorNuevaOferta no = new AdministradorNuevaOferta();
		PopupView pv = new PopupView(null, no);
		pv.setStyleName("pNuevoCliente");
		verticalPanel.addComponent(pv);
		
		addOfertaBtn.addClickListener(event -> {
			pv.setPopupVisible(true);
		});
	}
}
