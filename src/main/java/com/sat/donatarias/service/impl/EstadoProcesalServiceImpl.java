package com.sat.donatarias.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sat.donatarias.dao.EstadoProcesalDao;
import com.sat.donatarias.model.EstadoProcesal;
import com.sat.donatarias.service.EstadoProcesalService;

@Service
public class EstadoProcesalServiceImpl implements EstadoProcesalService {
	
	@Autowired
	EstadoProcesalDao estadoProcesalDao;

	/** Metodo que obtiene la lista del catalogo de estado procesal
	 *  @return List<EstadoProcesal> lista del catalogo de estado procesal
	 *  @author Julio Cesar Solorio
	 *  @since 06/2019 
	 * */
	@Override
	public List<EstadoProcesal> obtenListaEstadoProcesal(){
		return estadoProcesalDao.obtenListaEstadoProcesal();
	}

}
