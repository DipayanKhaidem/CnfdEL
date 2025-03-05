package com.example.lab5;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final List<Product> plist = new ArrayList<>();

    @Autowired
    private Product product; // Injecting Product Bean

    @GetMapping
    public List<Product> getProduct() {
        return plist;
    }

    @PostMapping
    public List<?> postProduct(@Valid @RequestBody Product product, BindingResult br) {
        List<String> fe = new ArrayList<>();
        if (br.hasErrors()) {
            for (FieldError error : br.getFieldErrors()) {
                fe.add(error.getField() + " " + error.getDefaultMessage());
            }
            return fe;
        } else {
            plist.add(product);
            return plist;
        }
    }

    @DeleteMapping("/{id}")
    public List<Product> deleteProduct(@PathVariable int id) {
        plist.removeIf(p -> p.getId() == id);
        return plist;
    }

    @PutMapping("/{id}")
    public List<Product> putProduct(@RequestBody Product product, @PathVariable int id) {
        for (Product p : plist) {
            if (id == p.getId()) {
                p.setName(product.getName());
                p.setPrice(product.getPrice());
                break;
            }
        }
        return plist;
    }
}
