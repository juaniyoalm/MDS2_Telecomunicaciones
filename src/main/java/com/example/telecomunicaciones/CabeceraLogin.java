package com.example.telecomunicaciones;

import com.vaadin.ui.UI;

public class CabeceraLogin extends V_CabeceraLogin {
	public CabeceraLogin() {
		clienteBtn.addClickListener(event -> {
			UI.getCurrent().getNavigator().navigateTo("/Cliente");
		});
	}
}
