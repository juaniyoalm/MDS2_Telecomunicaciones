package com.example.Telecomunicaciones;

import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

public class TeLLamamos extends Window {
	
	public TeLLamamos() {
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
		
		vertLogin.addComponent(new Label("Datos para la llamada"));
		
		HorizontalLayout horLogin1 = new HorizontalLayout();
		HorizontalLayout horLogin2 = new HorizontalLayout();
		HorizontalLayout horLogin3 = new HorizontalLayout();
		
		TextField tf1 = new TextField("Nombre:");
		tf1.setWidth("280px");
		
		horLogin1.addComponent(tf1);
		horLogin1.addStyleName("horLogin");
		horLogin1.setSizeFull();
		
		TextField tf2 = new PasswordField("Telefono:");
		tf2.setWidth("280px");
		
		horLogin2.addComponent(tf2);
		horLogin2.addStyleName("horLogin");
		horLogin2.setSizeFull();

		// Button close
		Button close = new Button("Cerrar", event -> close());
		close.addStyleName("sesionBtn");
		
		// Button aceptar
		Button sesion = new Button("Aceptar", event -> close());
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
