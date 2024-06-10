package med.vollmed.apiVollMed.medico;

import jakarta.validation.constraints.NotNull;
import med.vollmed.apiVollMed.direccion.DatosDireccion;
import med.vollmed.apiVollMed.direccion.Direccion;

public record DatosActualizarMedico(@NotNull Long id, String nombre, String documento, DatosDireccion direccion) {
}
