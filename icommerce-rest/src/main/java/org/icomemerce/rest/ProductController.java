package org.icomemerce.rest;

import org.icomemerce.dto.ProductDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/v1/products")
public class ProductController {

    @GetMapping("/search")
    public ProductDTO search() {
        return null;
    }
}
