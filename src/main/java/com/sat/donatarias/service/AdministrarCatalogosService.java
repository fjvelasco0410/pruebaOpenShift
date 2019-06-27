package com.sat.donatarias.service;

import java.util.List;

import com.sat.donatarias.bean.AdministrarCatalogosBean;
import com.sat.donatarias.bean.IngresaEmpleado;
import com.sat.donatarias.bean.StringResponse;
import com.sat.donatarias.model.AdministrarCatalogos;
import com.sat.donatarias.model.BuscarEmpleado;
import com.sat.donatarias.model.EmpleadoDatos;
import com.sat.donatarias.model.TareasPendientes;



public interface AdministrarCatalogosService {
	

	public List<AdministrarCatalogos> consultaCatalogo();
	public List<AdministrarCatalogos> infoTransparencia();
	public List<AdministrarCatalogos> sDonativos();
	public List<AdministrarCatalogos> transparencia();
	public List<AdministrarCatalogos> donatarias();
	public List<AdministrarCatalogos> actividades();
	public EmpleadoDatos insertarEmpleado(IngresaEmpleado empleado);

	public List<AdministrarCatalogos> permisos();
	

	public List<TareasPendientes> tareas(EmpleadoDatos empleado);


	public List<BuscarEmpleado> abogados(EmpleadoDatos empleado);
	

	public StringResponse modificar(String nombre);
	


}
