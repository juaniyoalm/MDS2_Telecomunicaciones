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
}
