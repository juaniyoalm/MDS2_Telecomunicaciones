package com.example.telecomunicaciones;

import com.vaadin.ui.PopupView;
import com.vaadin.ui.UI;
import com.vaadin.ui.renderers.ButtonRenderer;

public class ComercialIncidencias extends V_ComercialIncidencias {

	public ComercialIncidencias() {
		
		ComercialNuevaIncidencia ni = new ComercialNuevaIncidencia();
		PopupView pv = new PopupView(null, ni);
		pv.setStyleName("pNuevoCliente");
		verticalPanel.addComponent(pv);
		
		
		nuevaIncidenciaBtn.addClickListener(event -> {
			pv.setPopupVisible(true);
		});
		
		tableIncidenciasG.addColumn(person -> "Ver",
			      new ButtonRenderer(clickEvent -> {
			    		ComercialDetalleIncidencia di = new ComercialDetalleIncidencia();

			    		// Set window position.
			    		di.setPositionX(460);
			    		di.setPositionY(120);
			    		
			    		UI.getCurrent().addWindow(di);
			    }));
		tableIncidenciasG.addColumn(person -> "¿Realizada?",
			      new ButtonRenderer(clickEvent -> {
			    }));
		
		tableIncidenciasLL.addColumn(person -> "Ver",
			      new ButtonRenderer(clickEvent -> {
			    		ComercialDetalleIncidencia di = new ComercialDetalleIncidencia();

			    		// Set window position.
			    		di.setPositionX(460);
			    		di.setPositionY(120);
			    		
			    		UI.getCurrent().addWindow(di);
			    }));
		tableIncidenciasLL.addColumn(person -> "¿Realizada?",
			      new ButtonRenderer(clickEvent -> {
			    }));
	}
}
