package io.github.rodrigoqueiroz01.http.dto.request;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class ClientRequest {

    @NotNull(message = "Informe o nome do cliente.")
    private String fullName;

    @NotNull(message = "Informe o gênero.")
    private String genre;

    @NotNull(message = "Informe a data de nascimento.")
    private String birthDate;

    @NotNull(message = "Informe o CPF.")
    @CPF(message = "CPF inválido.")
    private String cpf;

    @NotNull(message = "Informe o telefone.")
    private String telephone;

    @NotNull(message = "Informe o email.")
    @Email(message = "E-mail inválido.")
    private String email;

}
