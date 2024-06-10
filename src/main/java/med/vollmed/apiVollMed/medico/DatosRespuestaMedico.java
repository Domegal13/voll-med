package med.vollmed.apiVollMed.medico;

import med.vollmed.apiVollMed.direccion.DatosDireccion;

public record DatosRespuestaMedico(
        Long id,
        String nombre,
        String email,
        String telefono,
        String documento,
        String especialidad,
        DatosDireccion direccion) {
}
