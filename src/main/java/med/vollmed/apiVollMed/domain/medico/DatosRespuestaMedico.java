package med.vollmed.apiVollMed.domain.medico;

import med.vollmed.apiVollMed.domain.direccion.DatosDireccion;

public record DatosRespuestaMedico(
        Long id,
        String nombre,
        String email,
        String telefono,
        String documento,
        String especialidad,
        DatosDireccion direccion) {
}
