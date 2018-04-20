package com.example.Telecomunicaciones;

import com.vaadin.ui.UI;
import com.vaadin.ui.renderers.ButtonRenderer;

public class AdministradorIncidencias extends V_AdministradorIncidencias {
	public AdministradorIncidencias() {
		tableIncidenciasS.addColumn(person -> "Ver",
			      new ButtonRenderer(clickEvent -> {
			    		ComercialDetalleIncidencia di = new ComercialDetalleIncidencia();

			    		// Set window position.
			    		di.setPositionX(460);
			    		di.setPositionY(120);
			    		
			    		UI.getCurrent().addWindow(di);
			    }));
		tableIncidenciasS.addColumn(person -> "Asignar",
			      new ButtonRenderer(clickEvent -> {
			    		AdministradorIncidenciasAsignar aa = new AdministradorIncidenciasAsignar();

			    		// Set window position.
			    		aa.setPositionX(460);
			    		aa.setPositionY(120);
			    		
			    		UI.getCurrent().addWindow(aa);
			    }));
		
		tableIncidenciasE.addColumn(person -> "Ver",
			      new ButtonRenderer(clickEvent -> {
			    		ComercialDetalleIncidencia di = new ComercialDetalleIncidencia();

			    		// Set window position.
			    		di.setPositionX(460);
			    		di.setPositionY(120);
			    		
			    		UI.getCurrent().addWindow(di);
			    }));
		tableIncidenciasA.addColumn(person -> "Ver",
			      new ButtonRenderer(clickEvent -> {
			    		ComercialDetalleIncidencia di = new ComercialDetalleIncidencia();

			    		// Set window position.
			    		di.setPositionX(460);
			    		di.setPositionY(120);
			    		
			    		UI.getCurrent().addWindow(di);
			    }));
	}
}
