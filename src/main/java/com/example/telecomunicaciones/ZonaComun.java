package com.example.telecomunicaciones;

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
	
	public ZonaComun(com.example.telecomunicaciones.bd.orm.Cliente c) {
		
		Navbar navbar = new Navbar();
		CabeceraLogin c_login = new CabeceraLogin();
		Cliente zonaCliente = new Cliente(c);

		c_login.clienteBtn.setCaption("Hola " + c.getNombre() + ". Logout");
		navbar.setStyleName("layotuNavbarLogin");
		
		cabeceraComun.addComponent(navbar);
		cabeceraComun.addComponent(c_login);
		
		this.addComponent(zonaCliente);
		
	}
	
	public ZonaComun(com.example.telecomunicaciones.bd.orm.Comercial c) {
		
		Navbar navbar = new Navbar();
		CabeceraLogin c_login = new CabeceraLogin();
		Comercial zonaComercial = new Comercial(c);

		c_login.clienteBtn.setCaption("Hola " + c.getNombre() + ". Logout");
		navbar.setStyleName("layotuNavbarLogin");
		
		cabeceraComun.addComponent(navbar);
		cabeceraComun.addComponent(c_login);
		
		this.addComponent(zonaComercial);
		
	}
	
	public ZonaComun(com.example.telecomunicaciones.bd.orm.Administrador a) {
		
		Navbar navbar = new Navbar();
		CabeceraLogin c_login = new CabeceraLogin();
		Administrador zonaAdmin = new Administrador(a);

		c_login.clienteBtn.setCaption("Hola " + a.getNombre() + ". Logout");
		navbar.setStyleName("layotuNavbarLogin");
		
		cabeceraComun.addComponent(navbar);
		cabeceraComun.addComponent(c_login);
		
		this.addComponent(zonaAdmin);
		
	}
}
