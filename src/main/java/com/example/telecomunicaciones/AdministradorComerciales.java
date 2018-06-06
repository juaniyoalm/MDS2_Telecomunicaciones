package com.example.telecomunicaciones;

import com.vaadin.ui.PopupView;
import com.vaadin.ui.UI;
import com.vaadin.ui.renderers.ButtonRenderer;

public class AdministradorComerciales extends V_AdministradorComerciales {

	public AdministradorComerciales() {
		
		AdministradorNew_ModComercial nc = new AdministradorNew_ModComercial();
		PopupView pv = new PopupView(null, nc);
		pv.setStyleName("pNuevoCliente");
		verticalPanel.addComponent(pv);
		
		tablaComerciales.addColumn(person -> "Ver",
			      new ButtonRenderer(clickEvent -> {
			    		AdministradorDetalleComercial dc = new AdministradorDetalleComercial();

			    		// Set window position.
			    		dc.setPositionX(460);
			    		dc.setPositionY(120);
			    		
			    		UI.getCurrent().addWindow(dc);
			    }));
		tablaComerciales.addColumn(person -> "Delete",
			      new ButtonRenderer(clickEvent -> {
			    }));
		
		nuevoComercialBtn.addClickListener(event -> {
			pv.setPopupVisible(true);
		});
	}
}
