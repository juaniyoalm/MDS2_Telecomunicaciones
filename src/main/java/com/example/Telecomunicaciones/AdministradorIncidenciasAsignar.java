package com.example.Telecomunicaciones;

import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

public class AdministradorIncidenciasAsignar extends Window {

	public AdministradorIncidenciasAsignar() {

		super();
		center();
		
		setClosable(false);
		setDraggable(false);
		setResizable(false);
		setModal(true);
		
		this.setWidth("320px");
		this.setHeight("280px");
		
		
		VerticalLayout vertAsignar = new VerticalLayout();
		vertAsignar.addStyleName("vertLogin");
		
		vertAsignar.addComponent(new Label("Incidencia Nº 2222"));
		
		HorizontalLayout horAsignar1 = new HorizontalLayout();
		HorizontalLayout horAsignar2 = new HorizontalLayout();
		
		Label tf = new Label("Comercial:");
		tf.setWidth("280px");
		
		horAsignar1.addComponent(tf);
		horAsignar1.addStyleName("horLogin");
		horAsignar1.setSizeFull();
		
		ComboBox<String> cf = new ComboBox<String>();
		cf.setWidth("280px");
		
		horAsignar1.addComponent(cf);
		horAsignar1.addStyleName("horLogin");
		horAsignar1.setSizeFull();

		// Button close
		Button close = new Button("Cerrar", event -> close());
		close.addStyleName("sesionBtn");
		
		// Button iniciar sesion
		Button sesion = new Button("Iniciar sesión", event -> {
			
			UI.getCurrent().getNavigator().addView("/Cliente", new ZonaComun("Juan"));
			UI.getCurrent().getNavigator().navigateTo("/Cliente");
			
			
			this.close();
			
		});
		sesion.addStyleName("sesionBtn");
		
		horAsignar2.addComponent(close);
		horAsignar2.addComponent(sesion);
		horAsignar2.addStyleName("horLoginBtn");
		horAsignar2.setSizeFull();
		
		
		vertAsignar.addComponent(horAsignar1);
		vertAsignar.addComponent(horAsignar2);
		vertAsignar.setSizeFull();
		
		setContent(vertAsignar);
	}
}
