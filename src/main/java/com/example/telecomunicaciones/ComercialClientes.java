package com.example.telecomunicaciones;

import java.util.ArrayList;

import com.example.telecomunicaciones.bd.BD_Principal;
import com.example.telecomunicaciones.bd.IComercial;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Grid;
import com.vaadin.ui.PopupView;
import com.vaadin.ui.UI;
import com.vaadin.ui.renderers.ButtonRenderer;

public class ComercialClientes extends V_ComercialClientes {

	public ComercialClientes() {
		
		//Creacion del Comercial Persona
		IComercial comercialBD = new BD_Principal();
		
		ComercialNew_ModCliente nc = new ComercialNew_ModCliente();
		PopupView pv = new PopupView(null, nc);
		pv.setStyleName("pNuevoCliente");
		verticalPanel.addComponent(pv);
		
		/*
		// Crea una tabla a traves de la lista de clientes
		ArrayList<com.example.telecomunicaciones.bd.orm.Cliente> clientes = comercialBD.cargarClientes();
		Grid<com.example.telecomunicaciones.bd.orm.Cliente> grid = new Grid<>();
		grid.setItems(clientes);
		grid.addColumn(com.example.telecomunicaciones.bd.orm.Cliente::getIDCliente).setCaption("ID");
		grid.addColumn(com.example.telecomunicaciones.bd.orm.Cliente::getNombre).setCaption("Nombre");
		grid.addColumn(com.example.telecomunicaciones.bd.orm.Cliente::getApellido1).setCaption("Apellido 1");
		grid.addColumn(com.example.telecomunicaciones.bd.orm.Cliente::getApellido2).setCaption("Apellido 2");
		grid.addColumn(com.example.telecomunicaciones.bd.orm.Cliente::getNif).setCaption("DNI");
		

		verticalPanel.addComponent(grid);
		
		*/
		/*
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
*/
	}
}

