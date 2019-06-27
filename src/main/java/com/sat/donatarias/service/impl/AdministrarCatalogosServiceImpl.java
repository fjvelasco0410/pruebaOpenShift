package com.sat.donatarias.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sat.donatarias.bean.IngresaEmpleado;
import com.sat.donatarias.bean.StringResponse;
import com.sat.donatarias.dao.AdministrarCatalogosDao;
import com.sat.donatarias.model.AdministrarCatalogos;
import com.sat.donatarias.model.BuscarEmpleado;
import com.sat.donatarias.model.EmpleadoDatos;
import com.sat.donatarias.model.TareasPendientes;
import com.sat.donatarias.service.AdministrarCatalogosService;


@Service
public class AdministrarCatalogosServiceImpl implements AdministrarCatalogosService {
	
	@Autowired
	AdministrarCatalogosDao administrarCatalogosDao;
	

	@Override
	public List<AdministrarCatalogos> consultaCatalogo() {
		
		return administrarCatalogosDao.consultaCatalogo();
	}
	
	@Override
	public List<AdministrarCatalogos> infoTransparencia() {
		
		return administrarCatalogosDao.infoTransparencia();
	}
	
	@Override
	public List<AdministrarCatalogos> sDonativos() {
		
		return administrarCatalogosDao.sDonativos();
	}
	
	@Override
	public List<AdministrarCatalogos> transparencia() {
		
		return administrarCatalogosDao.transparencia();
	}
	
	@Override
	public List<AdministrarCatalogos> donatarias() {
		
		return administrarCatalogosDao.donatarias();
	}
	
	@Override
	public List<AdministrarCatalogos> actividades() {
		
		return administrarCatalogosDao.actividades();
	}
	
	

	@Override
	public EmpleadoDatos insertarEmpleado(IngresaEmpleado empleado) {
		return administrarCatalogosDao.insertarEmpleado(empleado);
	}
	
	@Override
	public List<AdministrarCatalogos> permisos() {
		
		return administrarCatalogosDao.permisos();
	}
	
	@Override
	public List<TareasPendientes> tareas(EmpleadoDatos empleado) {
		
		return administrarCatalogosDao.tareas(empleado);
	}
	
	
	@Override
	public List<BuscarEmpleado> abogados(EmpleadoDatos empleado) {
		
		return administrarCatalogosDao.abogados(empleado);
	}
	
	@Override
	public StringResponse modificar(String nombre) {
		
		return administrarCatalogosDao.modificar(nombre);
	}
	
	
	
	
	
	
	
	

}
