package com.example.telecomunicaciones;

import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

public class ComercialDetalleIncidencia extends Window {

	public ComercialDetalleIncidencia() {
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

		//Tipo
		Label tfTipo = new Label("Tipo:");
		tfTipo.setWidth("280px");
		
		horDetalle1.addComponent(tfTipo);
		horDetalle1.addStyleName("horDetalle");
		horDetalle1.setSizeFull();
		
		Label rfTipo = new Label("General");
		rfTipo.setWidth("280px");
		
		horDetalle1.addComponent(rfTipo);
		horDetalle1.addStyleName("horDetalle");
		horDetalle1.setSizeFull();
		
		//DNI CLiente
		Label tfDNICliente = new Label("DNI:");
		tfDNICliente.setWidth("280px");
		
		horDetalle2.addComponent(tfDNICliente);
		horDetalle2.addStyleName("horDetalle");
		horDetalle2.setSizeFull();
		
		Label rfDNICliente = new Label("11111111A");
		rfDNICliente.setWidth("280px");
		
		horDetalle2.addComponent(rfDNICliente);
		horDetalle2.addStyleName("horLogin");
		horDetalle2.setSizeFull();
		
		//Descripccion
		Label tfDescripcion = new Label("Descripcion:");
		tfDescripcion.setWidth("280px");
		
		TextArea rfDescripcion = new TextArea();
		rfDescripcion.setWidth("280px");
		
		

		// Button close
		Button close = new Button("Cerrar", event -> close());
		close.addStyleName("sesionBtn");

		horDetalle1.setSpacing(false);
		horDetalle2.setSpacing(false);
		
		vertDetalleCliente.addComponent(horDetalle1);
		vertDetalleCliente.addComponent(horDetalle2);
		vertDetalleCliente.addComponent(tfDescripcion);
		vertDetalleCliente.addStyleName("horDetalle");
		vertDetalleCliente.addComponent(rfDescripcion);
		vertDetalleCliente.addStyleName("horDetalle");
		vertDetalleCliente.addComponent(close);
		vertDetalleCliente.setSizeFull();
		
		setContent(vertDetalleCliente);
	}
}
