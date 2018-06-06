package com.example.telecomunicaciones;

import com.vaadin.icons.VaadinIcons;

public class Comercial extends V_Comercial {

	public Comercial() {
		
		ComercialPrincipal principalPanel = new ComercialPrincipal();
		ComercialClientes clientesPanel = new ComercialClientes();
		ComercialIncidencias incidenciasPanel = new ComercialIncidencias();

		panelCenComercial.addComponent(principalPanel);
		
		// Botones Menu
		
		principal.setIcon(VaadinIcons.USER_CARD);
		principal.setCaption("     Principal");
		clientes.setIcon(VaadinIcons.CLIPBOARD_USER);
		clientes.setCaption("     Clientes");
		incidencias.setIcon(VaadinIcons.PIN);
		incidencias.setCaption("     Incidencias");
		
		principal.addClickListener(event -> {
			panelCenComercial.removeAllComponents();
			panelCenComercial.addComponent(principalPanel);
		});
		
		clientes.addClickListener(event -> {
			panelCenComercial.removeAllComponents();
			panelCenComercial.addComponent(clientesPanel);
		});
		
		incidencias.addClickListener(event -> {
			panelCenComercial.removeAllComponents();
			panelCenComercial.addComponent(incidenciasPanel);
		});
	}
}
