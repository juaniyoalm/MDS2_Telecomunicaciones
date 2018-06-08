package com.example.telecomunicaciones;

import java.util.ArrayList;

import com.example.telecomunicaciones.bd.BD_Principal;
import com.example.telecomunicaciones.bd.IAdministrador;
import com.example.telecomunicaciones.bd.IComercial;
import com.example.telecomunicaciones.bd.orm.Cliente;
import com.vaadin.shared.ui.grid.ColumnResizeMode;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Grid;
import com.vaadin.ui.PopupView;
import com.vaadin.ui.UI;
import com.vaadin.ui.renderers.ButtonRenderer;



public class ComercialClientes extends V_ComercialClientes {

	IComercial comercialBD;
	
	public ComercialClientes() {
		Inicializar();
	}
	
	private void Inicializar() {
		
		//Creacion del Comercial Persona
		
		comercialBD = new BD_Principal();
		
		
		ComercialNew_ModCliente nc = new ComercialNew_ModCliente();
		PopupView pv = new PopupView(null, nc);
		pv.setStyleName("pNuevoCliente");
		verticalPanel.addComponent(pv);
		
		
		// Crea una tabla a traves de la lista de clientes
		ArrayList<com.example.telecomunicaciones.bd.orm.Cliente> clientes = comercialBD.cargarClientes();
		System.out.println("ID: " + clientes.get(0).getIDCliente());
		Grid<com.example.telecomunicaciones.bd.orm.Cliente> grid = new Grid<>();
		grid.addColumn(com.example.telecomunicaciones.bd.orm.Cliente::getIDCliente).setCaption("ID");
		grid.addColumn(com.example.telecomunicaciones.bd.orm.Cliente::getNombre).setCaption("Nombre");
		grid.addColumn(com.example.telecomunicaciones.bd.orm.Cliente::getApellido1).setCaption("Apellido 1");
		grid.addColumn(com.example.telecomunicaciones.bd.orm.Cliente::getApellido2).setCaption("Apellido 2");
		grid.addColumn(com.example.telecomunicaciones.bd.orm.Cliente::getNif).setCaption("DNI");
		grid.addColumn(Cliente -> "Ver",
			      new ButtonRenderer(clickEvent -> {
			    	  	Cliente c = (Cliente)clickEvent.getItem();
			    		ComercialDetalleCliente dc = new ComercialDetalleCliente(c);

			    		// Set window position.
			    		dc.setPositionX(460);
			    		dc.setPositionY(120);
			    		dc.setWidth("650px");
			    		
			    		UI.getCurrent().addWindow(dc);
			    }));
		grid.addColumn(person -> "Delete",
			      new ButtonRenderer(clickEvent -> {
			    }));

		nuevoClienteBtn.addClickListener(event -> {
			pv.setPopupVisible(true);
		});
		
		grid.setItems(clientes);
		
		grid.setWidth("-1");
		grid.setSizeFull();
		grid.setColumnResizeMode(ColumnResizeMode.ANIMATED);
		verticalPanel.addComponent(grid);
	}
}

