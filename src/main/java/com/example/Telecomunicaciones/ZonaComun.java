package com.example.Telecomunicaciones;

import com.vaadin.navigator.View;

public class ZonaComun extends V_ZonaComun implements View {

		public ZonaComun() {
			Navbar navbar = new Navbar();
			CabeceraCibernauta c_cibernauta = new CabeceraCibernauta();
			Cibernauta zonaCibernuta = new Cibernauta();
			
			cabeceraComun.addComponent(navbar);
			cabeceraComun.addComponent(c_cibernauta);
			
			this.addComponent(zonaCibernuta);
		}
		
		public ZonaComun(String login) {
			
			Navbar navbar = new Navbar();
			CabeceraLogin c_login = new CabeceraLogin();
			
			Cliente zonaCliente = new Cliente();
			Comercial zonaComercial = new Comercial();
			Administrador zonaAdmin = new Administrador();
			
			navbar.setStyleName("layotuNavbarLogin");
			
			cabeceraComun.addComponent(navbar);
			cabeceraComun.addComponent(c_login);
			
			this.addComponent(zonaAdmin);
			
		}
}
