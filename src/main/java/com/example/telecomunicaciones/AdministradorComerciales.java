package com.example.telecomunicaciones;

import java.util.ArrayList;

import com.example.telecomunicaciones.bd.BD_Principal;
import com.example.telecomunicaciones.bd.IAdministrador;
import com.vaadin.ui.Grid;
import com.vaadin.ui.PopupView;
import com.vaadin.ui.UI;
import com.vaadin.ui.renderers.ButtonRenderer;

public class AdministradorComerciales extends V_AdministradorComerciales {
	
	IAdministrador administradorBD;

	public AdministradorComerciales() {
		Inicializar();
	}
	
	private void Inicializar() {
		
		administradorBD = new BD_Principal();
	
		AdministradorNew_ModComercial nc = new AdministradorNew_ModComercial();
		PopupView pv = new PopupView(null, nc);
		pv.setStyleName("pNuevoCliente");
		verticalPanel.addComponent(pv);
		
		// Crea una tabla a traves de la lista de clientes
		ArrayList<com.example.telecomunicaciones.bd.orm.Comercial> comerciales = administradorBD.cargarComerciales();
		Grid<com.example.telecomunicaciones.bd.orm.Comercial> grid = new Grid<>();
		grid.setItems(comerciales);
		grid.addColumn(com.example.telecomunicaciones.bd.orm.Comercial::getIDComercial).setCaption("ID");
		grid.addColumn(com.example.telecomunicaciones.bd.orm.Comercial::getNombre).setCaption("Nombre");
		grid.addColumn(com.example.telecomunicaciones.bd.orm.Comercial::getApellido1).setCaption("Apellido 1");
		grid.addColumn(com.example.telecomunicaciones.bd.orm.Comercial::getApellido2).setCaption("Apellido 2");
		grid.addColumn(com.example.telecomunicaciones.bd.orm.Comercial::getNif).setCaption("DNI");
		
		/*
		* como le pasamos el comercial de la fila a la ventanita detalle comercial????
		*/
		grid.addColumn(person -> "Ver",
			      new ButtonRenderer(clickEvent -> {
			    		AdministradorDetalleComercial dc = new AdministradorDetalleComercial();

			    		// Set window position.
			    		dc.setPositionX(460);
			    		dc.setPositionY(120);
			    		
			    		UI.getCurrent().addWindow(dc);
			    }));
		grid.addColumn(person -> "Delete",
			      new ButtonRenderer(clickEvent -> {
			    }));
		
		nuevoComercialBtn.addClickListener(event -> {
			pv.setPopupVisible(true);
		});
		verticalPanel.addComponent(grid);
	}
}
