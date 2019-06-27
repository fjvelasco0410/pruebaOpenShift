package com.sat.donatarias.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sat.donatarias.dao.EstadoProcesalDao;
import com.sat.donatarias.model.EstadoProcesal;


@Repository
public class EstadoProcesalDaoImpl implements EstadoProcesalDao {

	/** Metodo que obtiene la lista del catalogo de estado procesal
	 *  @return List<EstadoProcesal> lista del catalogo de estado procesal
	 *  @author Julio Cesar Solorio
	 *  @since 06/2019 
	 * */
	@Override
	public List<EstadoProcesal> obtenListaEstadoProcesal (){
		List<EstadoProcesal> lstEstadoProcesal = new ArrayList<EstadoProcesal>();
		EstadoProcesal estadoProcesal = new EstadoProcesal();
		
		estadoProcesal.setIdEstdoProcesal(0);
		estadoProcesal.setDescripcion("Selecciona");
		lstEstadoProcesal.add(estadoProcesal);

		estadoProcesal = new EstadoProcesal();
		estadoProcesal.setIdEstdoProcesal(1);
		estadoProcesal.setDescripcion("EstadoProcesal1");
		lstEstadoProcesal.add(estadoProcesal);
		
		estadoProcesal = new EstadoProcesal();
		estadoProcesal.setIdEstdoProcesal(2);
		estadoProcesal.setDescripcion("EstadoProcesal2");
		lstEstadoProcesal.add(estadoProcesal);
		
		return lstEstadoProcesal;
	}
	
}
