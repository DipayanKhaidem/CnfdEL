package com.example.lab5;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Set;

@Configuration
@ComponentScan(basePackages = "com.example.lab5")
public class AppConfig {

    @Bean
    public Product product() {
        Product product = new Product();
        product.setId(5); 
        product.setName("Sample Product");
        product.setPrice(50000); 

        validateProduct(product);

        return product;
    }

    private void validateProduct(Product product) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        Set<ConstraintViolation<Product>> violations = validator.validate(product);
        if (!violations.isEmpty()) {
            StringBuilder errors = new StringBuilder("Validation Errors:\n");
            for (ConstraintViolation<Product> violation : violations) {
                errors.append(violation.getPropertyPath()).append(": ").append(violation.getMessage()).append("\n");
            }
            throw new RuntimeException(errors.toString()); // ❌ Throws an error
        }
    }
}
