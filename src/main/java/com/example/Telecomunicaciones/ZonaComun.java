package com.example.Telecomunicaciones;

import com.vaadin.navigator.View;

public class ZonaComun extends V_ZonaComun implements View {

		public ZonaComun() {
			V_Navbar navbar = new V_Navbar();
			cabeceraComun.addComponent(navbar);
		}
}
