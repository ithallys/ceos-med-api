package med.ceos.api.medico;

import med.ceos.api.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade,
                                  DadosEndereco endereco) {
}
