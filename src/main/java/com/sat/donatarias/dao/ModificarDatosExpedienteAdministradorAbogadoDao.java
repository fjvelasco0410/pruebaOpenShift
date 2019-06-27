package com.sat.donatarias.dao;

import java.util.List;

import com.sat.donatarias.bean.ModificarDatosExpedienteAdministradorAbogadoBean;

public interface ModificarDatosExpedienteAdministradorAbogadoDao {
  
  List<ModificarDatosExpedienteAdministradorAbogadoBean> obtenerlista (ModificarDatosExpedienteAdministradorAbogadoBean modificarDatosExpedienteAdministradorAbogado);
  
  List<ModificarDatosExpedienteAdministradorAbogadoBean> buscarDatos (ModificarDatosExpedienteAdministradorAbogadoBean modificarDatosExpedienteAdministradorAbogado);
}
