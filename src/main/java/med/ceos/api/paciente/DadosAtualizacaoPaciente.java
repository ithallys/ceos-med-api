package med.ceos.api.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import med.ceos.api.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String nome,
        @Email
        String email,
        String telefone,
        @Valid
        DadosEndereco endereco) {
}
