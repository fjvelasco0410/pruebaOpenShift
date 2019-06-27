package com.sat.donatarias.dao.impl;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sat.donatarias.bean.AdministrarCatalogosBean;
import com.sat.donatarias.bean.IngresaEmpleado;
import com.sat.donatarias.bean.StringResponse;
import com.sat.donatarias.dao.AdministrarCatalogosDao;
import com.sat.donatarias.model.AdministrarCatalogos;
import com.sat.donatarias.model.BuscarEmpleado;
import com.sat.donatarias.model.EmpleadoDatos;
import com.sat.donatarias.model.TareasPendientes;


@Repository
public class AdministrarCatalogosDaoImpl implements AdministrarCatalogosDao{

	@Override
	public List<AdministrarCatalogos> consultaCatalogo() {
		
		List<AdministrarCatalogos> listaAdminCat=new ArrayList<AdministrarCatalogos>();
		
		AdministrarCatalogos objCat1=new AdministrarCatalogos();
		objCat1.setId(1);
		objCat1.setDescripcion("Informes de transparencia");
		listaAdminCat.add(objCat1);

		
		AdministrarCatalogos objCat2=new AdministrarCatalogos();
		objCat2.setId(2);
		objCat2.setDescripcion("Solicitudes para recibir donativos");
		listaAdminCat.add(objCat2);
		
		
		return listaAdminCat;
	}
	
	@Override
	public List<AdministrarCatalogos> infoTransparencia(){
		
		List<AdministrarCatalogos> recibirDon=new ArrayList<AdministrarCatalogos>();
		
		AdministrarCatalogos obj1=new AdministrarCatalogos();
		obj1.setId(1);
		obj1.setDescripcion("Informe de transparencias");
		recibirDon.add(obj1);
		
		AdministrarCatalogos obj2=new AdministrarCatalogos();
		obj2.setId(2);
		obj2.setDescripcion("Informe de sismos");
		recibirDon.add(obj2);
		
		AdministrarCatalogos obj3=new AdministrarCatalogos();
		obj3.setId(3);
		obj3.setDescripcion("Informes de liquidacion");
		recibirDon.add(obj3);
		
		AdministrarCatalogos obj4=new AdministrarCatalogos();
		obj4.setId(4);
		obj4.setDescripcion("Informe de Transmisión de Donativos por Revocación o No Renovación");
		recibirDon.add(obj4);
		
		AdministrarCatalogos obj5=new AdministrarCatalogos();
		obj5.setId(5);
		obj5.setDescripcion("Informe de cambio de Residencia");
		recibirDon.add(obj5);
		
		AdministrarCatalogos obj6=new AdministrarCatalogos();
		obj6.setId(6);
		obj6.setDescripcion("Campañas especificas");
		recibirDon.add(obj6);
		
		return recibirDon;
	}
	

	@Override
	public List<AdministrarCatalogos> sDonativos(){
		
		List<AdministrarCatalogos> recibirDon=new ArrayList<AdministrarCatalogos>();
		
		AdministrarCatalogos obj1=new AdministrarCatalogos();
		obj1.setId(1);
		obj1.setDescripcion("Solicitudes para recibir donativos");
		recibirDon.add(obj1);
		
		AdministrarCatalogos obj2=new AdministrarCatalogos();
		obj2.setId(2);
		obj2.setDescripcion("Solicitud de autorización para recibir donativos deducibles del impuesto sobre la renta");
		recibirDon.add(obj2);
		
		AdministrarCatalogos obj3=new AdministrarCatalogos();
		obj3.setId(3);
		obj3.setDescripcion("Solicitud de nueva autorización para recibir donativos deducibles del impuesto sobre la renta ");
		recibirDon.add(obj3);
		
		AdministrarCatalogos obj4=new AdministrarCatalogos();
		obj4.setId(4);
		obj4.setDescripcion("Solicitud de autorización para aplicar los donativos deducibles que reciba a la realización de actividades adicionales ");
		recibirDon.add(obj4);
		
		AdministrarCatalogos obj5=new AdministrarCatalogos();
		obj5.setId(5);
		obj5.setDescripcion("Solicitud de autorización para aplicar los donativos que reciba a la educación de otros niveles, grados o carreras que cuenten con autorización o reconocimiento de validez oficial de estudios ");
		recibirDon.add(obj5);
		
		AdministrarCatalogos obj6=new AdministrarCatalogos();
		obj6.setId(6);
		obj6.setDescripcion("Solicitud de avisos para actualización del padrón y directorio de donatarias autorizadas para recibir donativos deducibles ");
		recibirDon.add(obj6);
		
		AdministrarCatalogos obj7=new AdministrarCatalogos();
		obj7.setId(7);
		obj7.setDescripcion("Diversas solicitudes relacionadas con la autorización para recibir donativos deducibles de impuesto sobre la renta ");
		recibirDon.add(obj7);
		
		AdministrarCatalogos obj8=new AdministrarCatalogos();
		obj8.setId(8);
		obj8.setDescripcion("Solicitud de cumplimiento de requerimiento y autorización condicionada ");
		recibirDon.add(obj8);
		
		
		
		
		return recibirDon;
		
		
		
	}
	
	

	@Override
	public List<AdministrarCatalogos> transparencia(){
		
		List<AdministrarCatalogos> recibirDon=new ArrayList<AdministrarCatalogos>();
		
		AdministrarCatalogos obj1=new AdministrarCatalogos();
		obj1.setId(1);
		obj1.setDescripcion("Transparencia");
		recibirDon.add(obj1);
		
		AdministrarCatalogos obj2=new AdministrarCatalogos();
		obj2.setId(2);
		obj2.setDescripcion("Gastos de administración");
		recibirDon.add(obj2);
		
		AdministrarCatalogos obj3=new AdministrarCatalogos();
		obj3.setId(3);
		obj3.setDescripcion("Clasificación del gasto ");
		recibirDon.add(obj3);
		
		AdministrarCatalogos obj4=new AdministrarCatalogos();
		obj4.setId(4);
		obj4.setDescripcion("Beneficiario del servicio prestado ");
		recibirDon.add(obj4);
		
		AdministrarCatalogos obj5=new AdministrarCatalogos();
		obj5.setId(5);
		obj5.setDescripcion("Otros ingresos ");
		recibirDon.add(obj5);
		
		AdministrarCatalogos obj6=new AdministrarCatalogos();
		obj6.setId(6);
		obj6.setDescripcion("Comprobante emitido ");
		recibirDon.add(obj6);
		
		AdministrarCatalogos obj7=new AdministrarCatalogos();
		obj7.setId(7);
		obj7.setDescripcion("Comprobante recibido ");
		recibirDon.add(obj7);
		
		AdministrarCatalogos obj8=new AdministrarCatalogos();
		obj8.setId(8);
		obj8.setDescripcion("Orden de gobierno ");
		recibirDon.add(obj8);
		
		
		
		
		return recibirDon;
	}


	@Override
	public List<AdministrarCatalogos> donatarias(){
		
		List<AdministrarCatalogos> recibirDon=new ArrayList<AdministrarCatalogos>();
		
		AdministrarCatalogos obj1=new AdministrarCatalogos();
		obj1.setId(1);
		obj1.setDescripcion("Donatarias");
		recibirDon.add(obj1);
		
		AdministrarCatalogos obj2=new AdministrarCatalogos();
		obj2.setId(2);
		obj2.setDescripcion("Tipos de aviso a presentar");
		recibirDon.add(obj2);
		
		AdministrarCatalogos obj3=new AdministrarCatalogos();
		obj3.setId(3);
		obj3.setDescripcion("Documento para resolución ");
		recibirDon.add(obj3);
		
		AdministrarCatalogos obj4=new AdministrarCatalogos();
		obj4.setId(4);
		obj4.setDescripcion("Tipo de resolución  ");
		recibirDon.add(obj4);
		
		AdministrarCatalogos obj5=new AdministrarCatalogos();
		obj5.setId(5);
		obj5.setDescripcion("Estatus del trámite");
		recibirDon.add(obj5);
		
		AdministrarCatalogos obj6=new AdministrarCatalogos();
		obj6.setId(6);
		obj6.setDescripcion("Estado del trámite ");
		recibirDon.add(obj6);
		
		AdministrarCatalogos obj7=new AdministrarCatalogos();
		obj7.setId(7);
		obj7.setDescripcion("Estado de la publicación   ");
		recibirDon.add(obj7);
		
		
		
		
		
		return recibirDon;
	}
	
	
	@Override
	public List<AdministrarCatalogos> actividades(){
		
		List<AdministrarCatalogos> recibirDon=new ArrayList<AdministrarCatalogos>();
		
		AdministrarCatalogos obj1=new AdministrarCatalogos();
		obj1.setId(1);
		obj1.setDescripcion("Actividades");
		recibirDon.add(obj1);
		
		AdministrarCatalogos obj2=new AdministrarCatalogos();
		obj2.setId(2);
		obj2.setDescripcion("Rubro");
		recibirDon.add(obj2);
		
		AdministrarCatalogos obj3=new AdministrarCatalogos();
		obj3.setId(3);
		obj3.setDescripcion("Subrubro ");
		recibirDon.add(obj3);
		
		AdministrarCatalogos obj4=new AdministrarCatalogos();
		obj4.setId(4);
		obj4.setDescripcion("Rubro autorizado");
		recibirDon.add(obj4);
		
		AdministrarCatalogos obj5=new AdministrarCatalogos();
		obj5.setId(5);
		obj5.setDescripcion("Tipo donante");
		recibirDon.add(obj5);
		
		AdministrarCatalogos obj6=new AdministrarCatalogos();
		obj6.setId(6);
		obj6.setDescripcion("Tipo donanativo");
		recibirDon.add(obj6);
		
		AdministrarCatalogos obj7=new AdministrarCatalogos();
		obj7.setId(7);
		obj7.setDescripcion("Tipo de recurso");
		recibirDon.add(obj7);
		
		AdministrarCatalogos obj8=new AdministrarCatalogos();
		obj8.setId(8);
		obj8.setDescripcion("Origen del recurso");
		recibirDon.add(obj8);
		
		AdministrarCatalogos obj9=new AdministrarCatalogos();
		obj9.setId(9);
		obj9.setDescripcion("Destino");
		recibirDon.add(obj9);
		
		AdministrarCatalogos obj10=new AdministrarCatalogos();
		obj10.setId(10);
		obj10.setDescripcion("Uso destino");
		recibirDon.add(obj10);
		
		return recibirDon;
	}
	
	@Override
	public EmpleadoDatos insertarEmpleado(IngresaEmpleado empleado) {
		

		EmpleadoDatos datos=new EmpleadoDatos();
		
		datos.setNombre("Arron");
		datos.setNumero("1234");
		datos.setPaterno("Goemz");
		datos.setMaterno("Martinez");
		datos.setRfcEmpleado("asdf1234");
		datos.setRfcCorto("as12");

		
		return datos; 		
	}
	
	@Override
	public List<AdministrarCatalogos> permisos(){
		
		List<AdministrarCatalogos> recibirDon=new ArrayList<AdministrarCatalogos>();
		
		AdministrarCatalogos obj1=new AdministrarCatalogos();
		obj1.setId(1);
		obj1.setDescripcion("Administrador");
		recibirDon.add(obj1);
		
		AdministrarCatalogos obj2=new AdministrarCatalogos();
		obj2.setId(2);
		obj2.setDescripcion("Abogado");
		recibirDon.add(obj2);
		
		AdministrarCatalogos obj3=new AdministrarCatalogos();
		obj3.setId(3);
		obj3.setDescripcion("Administrador de catalogos");
		recibirDon.add(obj3);
		
		AdministrarCatalogos obj4=new AdministrarCatalogos();
		obj4.setId(4);
		obj4.setDescripcion("Administrador responsable");
		recibirDon.add(obj4);
		
		return recibirDon;

}
	
	@Override
	public List<TareasPendientes> tareas(EmpleadoDatos empleado){
		
		List<TareasPendientes> recibirDon=new ArrayList<TareasPendientes>();
		
		TareasPendientes obj1=new TareasPendientes();
		
		obj1.setEstadoProcesal("estado procesal");
		obj1.setNumeroAsunto("numero de asunto");
		obj1.setNumeroExpendiente("numero de expediente");
		obj1.setRfc("rfc");
		obj1.setTipoSolicitud("tipo de solicitud");
		recibirDon.add(obj1);
		
	TareasPendientes obj2=new TareasPendientes();
		
		obj1.setEstadoProcesal("estado procesal 2");
		obj1.setNumeroAsunto("numero de asunto 2");
		obj1.setNumeroExpendiente("numero de expediente 2");
		obj1.setRfc("rfc 2");
		obj1.setTipoSolicitud("tipo de solicitud 2");
		recibirDon.add(obj2);
		
	    
		
		return recibirDon;

}
	

	@Override
	public List<BuscarEmpleado> abogados(EmpleadoDatos empleado){
		
		List<BuscarEmpleado> recibirDon=new ArrayList<BuscarEmpleado>();
		
		BuscarEmpleado obj1=new BuscarEmpleado();
		
		obj1.setEstadoProcesal("estado procesal");
		obj1.setNombreEmpleado("numero de asunto");
		obj1.setTareasPendientes(1);
		obj1.setNumeroEmpleado("asdf");
		recibirDon.add(obj1);
		
BuscarEmpleado obj2=new BuscarEmpleado();
		
		obj1.setEstadoProcesal("estado procesal 2");
		obj1.setNombreEmpleado("numero de asunto 2");
		obj1.setTareasPendientes(2);
		obj1.setNumeroEmpleado("asdf 2");
		recibirDon.add(obj2);
	    
		
		return recibirDon;

}
	
	@Override
	public StringResponse modificar(String nombre){
		
		StringResponse obj1=new StringResponse();
		obj1.setResponse("Informe de transparencia");
		
		return obj1;
	
}

}