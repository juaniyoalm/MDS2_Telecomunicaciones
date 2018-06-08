package com.example.telecomunicaciones;

import com.example.telecomunicaciones.bd.BD_Principal;
import com.example.telecomunicaciones.bd.ICibernauta;
import com.example.telecomunicaciones.bd.orm.Administrador;
import com.example.telecomunicaciones.bd.orm.Cliente;
import com.example.telecomunicaciones.bd.orm.ClienteDAO;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.AbstractErrorMessage.ContentMode;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

public class Login extends Window {
	
	ICibernauta ciber = new BD_Principal();
	
	public Login() {
		super();
		center();
		
		setClosable(false);
		setDraggable(false);
		setResizable(false);
		setModal(true);
		
		this.setWidth("320px");
		this.setHeight("280px");
		
		
		VerticalLayout vertLogin = new VerticalLayout();
		vertLogin.addStyleName("vertLogin");
		
		vertLogin.addComponent(new Label("Iniciar sesión"));
		
		HorizontalLayout horLogin1 = new HorizontalLayout();
		HorizontalLayout horLogin2 = new HorizontalLayout();
		HorizontalLayout horLogin3 = new HorizontalLayout();
		
		TextField tf = new TextField("Usuario:");
		tf.setWidth("280px");
		
		horLogin1.addComponent(tf);
		horLogin1.addStyleName("horLogin");
		horLogin1.setSizeFull();
		
		PasswordField pf = new PasswordField("Password:");
		pf.setWidth("280px");
		
		horLogin2.addComponent(pf);
		horLogin2.addStyleName("horLogin");
		horLogin2.setSizeFull();

		// Button close
		Button close = new Button("Cerrar", event -> close());
		close.addStyleName("sesionBtn");
		
		// Button iniciar sesion
		Button sesion = new Button("Iniciar sesión", event -> {
			
			int res = ciber.iniciarSesion(tf.getValue(), pf.getValue());
			
			if (res == 1) {
				System.out.println("Es un cliente");
				Cliente c = ciber.iniciarCliente(tf.getValue(), pf.getValue());
				UI.getCurrent().getNavigator().addView("/Cliente", new ZonaComun(c));
				UI.getCurrent().getNavigator().navigateTo("/Cliente");
			}
			else if (res == 2) {
				System.out.println("Es un comercial");
				com.example.telecomunicaciones.bd.orm.Comercial c = ciber.iniciarComercial(tf.getValue(), pf.getValue());
				UI.getCurrent().getNavigator().addView("/Comercial", new ZonaComun(c));
				UI.getCurrent().getNavigator().navigateTo("/Comercial");
			}
			else if (res == 3) {
				System.out.println("Es un admin");
				Administrador a = ciber.iniciarAdmin(tf.getValue(), pf.getValue());
				UI.getCurrent().getNavigator().addView("/Admin", new ZonaComun(a));
				UI.getCurrent().getNavigator().navigateTo("/Admin");
			}
			else if (res == 0){
				
				System.out.println("No es nada");
			}
			
			
			this.close();
			
		});
		sesion.addStyleName("sesionBtn");
		
		horLogin3.addComponent(close);
		horLogin3.addComponent(sesion);
		horLogin3.addStyleName("horLoginBtn");
		horLogin3.setSizeFull();
		
		
		vertLogin.addComponent(horLogin1);
		vertLogin.addComponent(horLogin2);
		vertLogin.addComponent(horLogin3);
		vertLogin.setSizeFull();
		
		setContent(vertLogin);
	}
	
}
