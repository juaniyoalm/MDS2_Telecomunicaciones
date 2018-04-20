package com.example.Telecomunicaciones;

import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

public class AdministradorDetalleComercial extends Window {
	public AdministradorDetalleComercial() {
		super();
		center();
		
		setClosable(false);
		setDraggable(false);
		setResizable(false);
		setModal(true);
		
		this.setWidth("500px");
		this.setHeight("600px");
		
		
		VerticalLayout vertDetalleCliente = new VerticalLayout();
		vertDetalleCliente.addStyleName("vertDetalleCliente");
		
		vertDetalleCliente.addComponent(new Label("Detalle de cliente"));
		
		HorizontalLayout horDetalle1 = new HorizontalLayout();
		HorizontalLayout horDetalle2 = new HorizontalLayout();
		HorizontalLayout horDetalle3 = new HorizontalLayout();
		HorizontalLayout horDetalle4 = new HorizontalLayout();
		HorizontalLayout horDetalle5 = new HorizontalLayout();
		HorizontalLayout horDetalle6 = new HorizontalLayout();

		
		//Nombre
		Label tfNombre = new Label("Nombre:");
		tfNombre.setWidth("280px");
		
		horDetalle1.addComponent(tfNombre);
		horDetalle1.addStyleName("horDetalle");
		horDetalle1.setSizeFull();
		
		Label rfNombre = new Label("Juan");
		rfNombre.setWidth("280px");
		
		horDetalle1.addComponent(rfNombre);
		horDetalle1.addStyleName("horLogin");
		horDetalle1.setSizeFull();
		
		//Apellidos
		Label tfApellidos = new Label("Apellidos:");
		tfApellidos.setWidth("280px");
		
		horDetalle2.addComponent(tfApellidos);
		horDetalle2.addStyleName("horDetalle");
		horDetalle2.setSizeFull();
		
		Label rfApellidos = new Label("Juan");
		rfApellidos.setWidth("280px");
		
		horDetalle2.addComponent(rfApellidos);
		horDetalle2.addStyleName("horLogin");
		horDetalle2.setSizeFull();
		
		//Domicilio
		Label tfDomicilio = new Label("Domicilio:");
		tfDomicilio.setWidth("280px");
		
		horDetalle3.addComponent(tfDomicilio);
		horDetalle3.addStyleName("horDetalle");
		horDetalle3.setSizeFull();
		
		Label rfDomicilio = new Label("Callo lolo");
		rfDomicilio.setWidth("280px");
		
		horDetalle3.addComponent(rfDomicilio);
		horDetalle3.addStyleName("horDetalle");
		horDetalle3.setSizeFull();
		
		//Email
		Label tfEmail = new Label("Email:");
		tfEmail.setWidth("280px");
		
		horDetalle4.addComponent(tfEmail);
		horDetalle4.addStyleName("horDetalle");
		horDetalle4.setSizeFull();
		
		Label rfEmail = new Label("juan@hola.com");
		rfEmail.setWidth("280px");
		
		horDetalle4.addComponent(rfEmail);
		horDetalle4.addStyleName("horDetalle");
		horDetalle4.setSizeFull();
		
		//IBAN
		Label tfNcomercial = new Label("Nº Comercial:");
		tfNcomercial.setWidth("280px");
		
		horDetalle5.addComponent(tfNcomercial);
		horDetalle5.addStyleName("horDetalle");
		horDetalle5.setSizeFull();
		
		Label rfNcomercial = new Label("00000000");
		rfNcomercial.setWidth("280px");
		
		horDetalle5.addComponent(rfNcomercial);
		horDetalle5.addStyleName("horDetalle");
		horDetalle5.setSizeFull();

		// Button close
		Button close = new Button("Cerrar", event -> close());
		close.addStyleName("sesionBtn");
		
		// Button iniciar sesion
		Button modificar = new Button("Modificar", event -> {
			
			//UI.getCurrent().getNavigator().addView("/Cliente", new ZonaComun("Juan"));
			//UI.getCurrent().getNavigator().navigateTo("/Cliente");
			
			this.close();
			
		});
		modificar.addStyleName("sesionBtn");
		
		horDetalle6.addComponent(close);
		horDetalle6.addComponent(modificar);
		horDetalle6.addStyleName("clienteBtn");
		horDetalle6.setSizeFull();
			
		horDetalle1.setSpacing(false);
		horDetalle2.setSpacing(false);
		horDetalle3.setSpacing(false);
		horDetalle4.setSpacing(false);
		horDetalle5.setSpacing(false);
		horDetalle6.setSpacing(false);
		
		vertDetalleCliente.addComponent(horDetalle1);
		vertDetalleCliente.addComponent(horDetalle2);
		vertDetalleCliente.addComponent(horDetalle3);
		vertDetalleCliente.addComponent(horDetalle4);
		vertDetalleCliente.addComponent(horDetalle5);
		vertDetalleCliente.addComponent(horDetalle6);
		vertDetalleCliente.setSizeFull();
		
		setContent(vertDetalleCliente);
	}
}
