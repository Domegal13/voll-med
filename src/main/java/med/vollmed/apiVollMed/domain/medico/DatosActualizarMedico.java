package med.vollmed.apiVollMed.domain.medico;

import jakarta.validation.constraints.NotNull;
import med.vollmed.apiVollMed.domain.direccion.DatosDireccion;

public record DatosActualizarMedico(@NotNull Long id, String nombre, String documento, DatosDireccion direccion) {
}
