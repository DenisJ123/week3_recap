package ie.atu.week3;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @NotBlank(message = "Id cannot be blank")
    private String id;
    @NotBlank(message = "Name cannot be null")
    private String name;
    @Positive(message = "Price cannot be negative")
    private double price;



}