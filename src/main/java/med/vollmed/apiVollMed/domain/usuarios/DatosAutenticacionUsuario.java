package med.vollmed.apiVollMed.domain.usuarios;

import jakarta.validation.constraints.NotBlank;

public record DatosAutenticacionUsuario(

        String login,

        String clave) {

}
