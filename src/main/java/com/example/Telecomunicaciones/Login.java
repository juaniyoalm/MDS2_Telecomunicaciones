package com.example.Telecomunicaciones;

import com.vaadin.server.AbstractErrorMessage.ContentMode;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

public class Login extends Window {
	
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
		Button sesion = new Button("Iniciar sesión", event -> close());
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
