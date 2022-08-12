package io.github.rodrigoqueiroz01.http.dto.request;

import lombok.Getter;
import lombok.Setter;
<<<<<<< HEAD

import javax.validation.constraints.NotNull;
=======
>>>>>>> b87d67aab239ed7283b7f493da970ce236ebdbd7
import java.math.BigDecimal;

@Getter
@Setter
public class ProductRequest {

<<<<<<< HEAD
    @NotNull(message = "Informe a descrição.")
    private String description;

    @NotNull(message = "Informe o preço.")
    private BigDecimal price;

    @NotNull(message = "Informe a quantidade em estoque.")
=======
    private String description;
    private BigDecimal price;
>>>>>>> b87d67aab239ed7283b7f493da970ce236ebdbd7
    private Integer quantityStock;

}
