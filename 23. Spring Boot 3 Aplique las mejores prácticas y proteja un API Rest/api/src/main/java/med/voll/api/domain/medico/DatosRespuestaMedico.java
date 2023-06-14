package med.voll.api.domain.medico;

import med.voll.api.domain.direccion.DatosDireccion;

public record DatosRespuestaMedico(long id, String nombre, String email, String telefono, String documento, String especialidad,
                                   DatosDireccion datosDireccion) {
}
