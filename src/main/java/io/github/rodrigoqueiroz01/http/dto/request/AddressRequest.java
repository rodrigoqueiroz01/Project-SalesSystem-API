package io.github.rodrigoqueiroz01.http.dto.request;

import lombok.Getter;
import lombok.Setter;

<<<<<<< HEAD
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

=======
>>>>>>> b87d67aab239ed7283b7f493da970ce236ebdbd7
@Getter
@Setter
public class AddressRequest {

<<<<<<< HEAD
    @NotNull(message = "Informe o CEP.")
    private String zipCode;

    @NotNull(message = "Informe o endereço.")
    private String address;

    @NotNull(message = "Informe o número.")
    private Integer number;

    @NotNull(message = "Informe o bairro.")
=======
    private String zipCode;
    private String address;
    private Integer number;
>>>>>>> b87d67aab239ed7283b7f493da970ce236ebdbd7
    private String district;

}
