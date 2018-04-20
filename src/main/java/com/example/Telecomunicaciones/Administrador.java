package com.example.Telecomunicaciones;

import com.vaadin.icons.VaadinIcons;

public class Administrador extends V_Administrador {

	public Administrador() {
		
		AdministradorPrincipal principalPanel = new AdministradorPrincipal();
		ComercialClientes clientesPanel = new ComercialClientes();
		AdministradorComerciales comercialesPanel = new AdministradorComerciales();
		AdministradorIncidencias incidenciasPanel = new AdministradorIncidencias();
		AdministradorServicios serviciosPanel = new AdministradorServicios();
		
		panelCenAdmin.addComponent(principalPanel);
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
		
		
		principal.addClickListener(event -> {
			panelCenAdmin.removeAllComponents();
			panelCenAdmin.addComponent(principalPanel);
		});
		
		clientes.addClickListener(event -> {
			panelCenAdmin.removeAllComponents();
			panelCenAdmin.addComponent(clientesPanel);
		});
		
		comerciales.addClickListener(event -> {
			panelCenAdmin.removeAllComponents();
			panelCenAdmin.addComponent(comercialesPanel);
		});
		
		incidencias.addClickListener(event -> {
			panelCenAdmin.removeAllComponents();
			panelCenAdmin.addComponent(incidenciasPanel);
		});
		
		servicios.addClickListener(event -> {
			panelCenAdmin.removeAllComponents();
			panelCenAdmin.addComponent(serviciosPanel);
		});
	}
}
