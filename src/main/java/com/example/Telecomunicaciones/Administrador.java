package com.example.Telecomunicaciones;

import com.vaadin.icons.VaadinIcons;

public class Administrador extends V_Administrador {

	public Administrador() {
		
		ComercialClientes zonaClientes = new ComercialClientes();
		panelCenAdmin.addComponent(zonaClientes);
		// menu botones
		
		principal.setIcon(VaadinIcons.USER_CARD);
		principal.setCaption("     Principal");
		clientes.setIcon(VaadinIcons.CLIPBOARD_USER);
		clientes.setCaption("     Clientes");
		comerciales.setIcon(VaadinIcons.MONEY);
		comerciales.setCaption("     Comerciales");
		incidencias.setIcon(VaadinIcons.PIN);
		incidencias.setCaption("     Incidencias");
		servicios.setIcon(VaadinIcons.PIN);
		servicios.setCaption("     Servicios");
	}
}
