package com.example.Telecomunicaciones;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.PopupView;
import com.vaadin.ui.UI;
import com.vaadin.ui.renderers.ButtonRenderer;

public class ComercialClientes extends V_ComercialClientes {

	public ComercialClientes() {
		
		ComercialNew_ModCliente nc = new ComercialNew_ModCliente();
		PopupView pv = new PopupView(null, nc);
		pv.setStyleName("pNuevoCliente");
		verticalPanel.addComponent(pv);
		
		
		tablaClientes.addColumn(person -> "Ver",
			      new ButtonRenderer(clickEvent -> {
			    		ComercialDetalleCliente dc = new ComercialDetalleCliente();

			    		// Set window position.
			    		dc.setPositionX(460);
			    		dc.setPositionY(120);
			    		
			    		UI.getCurrent().addWindow(dc);
			    }));
		tablaClientes.addColumn(person -> "Delete",
			      new ButtonRenderer(clickEvent -> {
			    }));

		nuevoClienteBtn.addClickListener(event -> {
			pv.setPopupVisible(true);
		});

	}
}

