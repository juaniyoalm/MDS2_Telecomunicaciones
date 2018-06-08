package com.example.telecomunicaciones;

import java.util.ArrayList;

import com.example.telecomunicaciones.bd.BD_Principal;
import com.example.telecomunicaciones.bd.IAdministrador;
import com.vaadin.ui.Grid;
import com.vaadin.ui.UI;
import com.vaadin.ui.renderers.ButtonRenderer;

public class AdministradorIncidencias extends V_AdministradorIncidencias {
	
	IAdministrador administradorBD;
	
	public AdministradorIncidencias() {
		Inicializar();
	}
	
	private void Inicializar() {
		
		administradorBD = new BD_Principal();
		
		ArrayList<com.example.telecomunicaciones.bd.orm.Incidencia> incidencias = administradorBD.cargarIncidencias();
		Grid<com.example.telecomunicaciones.bd.orm.Incidencia> grid = new Grid<>();
		grid.setItems(incidencias);
		grid.addColumn(com.example.telecomunicaciones.bd.orm.Incidencia::getID).setCaption("ID");
		grid.addColumn(com.example.telecomunicaciones.bd.orm.Incidencia::getAsunto).setCaption("Asunto");
		grid.addColumn(com.example.telecomunicaciones.bd.orm.Incidencia::getDescripcion).setCaption("Descripcion");
		grid.addColumn(com.example.telecomunicaciones.bd.orm.Incidencia::getFecha).setCaption("Fecha");

		/*
		* por que tabla incidencias s e y a???????
		*/
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
		
		verticalPanel.addComponent(grid);
	}
}
