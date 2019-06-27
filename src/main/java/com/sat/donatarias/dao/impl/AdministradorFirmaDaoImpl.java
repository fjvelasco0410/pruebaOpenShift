package com.sat.donatarias.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sat.donatarias.dao.AdministradorFirmaDao;
import com.sat.donatarias.model.AdministradorFirma;

@Repository
public class AdministradorFirmaDaoImpl implements AdministradorFirmaDao {

	/** Metodo que obtiene la lista del catalogo de dministrador firma
	 *  @return List<AdministradorFirma> catalogo de dministrador firma
	 *  @author Julio Cesar Solorio
	 *  @since 06/2019 
	 * */
	@Override
	public List<AdministradorFirma> obtenListaAdministradorFirma(){
		System.out.println("Entro a obtenListaAdministradorFirma");
		List<AdministradorFirma> listaAdministradorFirma = new ArrayList<AdministradorFirma>();
		AdministradorFirma administradorFirma = new AdministradorFirma();
		administradorFirma.setIdAdministradorFirma(1);
		administradorFirma.setDescripcion("Prueba");
		listaAdministradorFirma.add(administradorFirma);
		
		return listaAdministradorFirma;		
	} 

}
