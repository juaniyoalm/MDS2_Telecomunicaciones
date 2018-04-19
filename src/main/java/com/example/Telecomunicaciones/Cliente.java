package com.example.Telecomunicaciones;

import com.vaadin.icons.VaadinIcons;

public class Cliente extends V_Cliente {
	
	public Cliente() {
		
		ClienteMisDatos misDatosPanel = new ClienteMisDatos();
		ClienteMisContratos misContratosPanel = new ClienteMisContratos();
		ClienteMisFacturas misFacturasPanel = new ClienteMisFacturas();
		ClienteMisIncidencias misIncidenciasPanel = new ClienteMisIncidencias();
		panelCenCliente.addComponent(misDatosPanel);
		
		// Botones Menu
		
		misDatos.setIcon(VaadinIcons.USER_CARD);
		misDatos.setCaption("     Mis Datos");
		misContratos.setIcon(VaadinIcons.CLIPBOARD_USER);
		misContratos.setCaption("     Mis Contratos");
		misFacturas.setIcon(VaadinIcons.MONEY);
		misFacturas.setCaption("     Mis Facturas");
		misIncidencias.setIcon(VaadinIcons.PIN);
		misIncidencias.setCaption("     Mis Incidencias");
		
		misDatos.addClickListener(event -> {
			panelCenCliente.removeAllComponents();
			panelCenCliente.addComponent(misDatosPanel);
		});
		
		misContratos.addClickListener(event -> {
			panelCenCliente.removeAllComponents();
			panelCenCliente.addComponent(misContratosPanel);
		});
		
		misFacturas.addClickListener(event -> {
			panelCenCliente.removeAllComponents();
			panelCenCliente.addComponent(misFacturasPanel);
		});
		
		misIncidencias.addClickListener(event -> {
			panelCenCliente.removeAllComponents();
			panelCenCliente.addComponent(misIncidenciasPanel);
		});
		
		
	}

}
