package com.sat.donatarias.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sat.donatarias.dao.AdministradorFirmaDao;
import com.sat.donatarias.model.AdministradorFirma;
import com.sat.donatarias.service.AdministradorFirmaService;

@Service
public class AdministradorFirmaServiceImpl implements AdministradorFirmaService {
	
	@Autowired
	AdministradorFirmaDao administradorFirmaDao;

	/** Metodo que obtiene la lista del catalogo de dministrador firma
	 *  @return List<AdministradorFirma> catalogo de dministrador firma
	 *  @author Julio Cesar Solorio
	 *  @since 06/2019 
	 * */
	@Override
	public List<AdministradorFirma> obtenListaAdministradorFirma(){
		return administradorFirmaDao.obtenListaAdministradorFirma();		
	} 

}
