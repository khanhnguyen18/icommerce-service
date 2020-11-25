package org.icommerce.rest;

import lombok.AllArgsConstructor;
import org.icommerce.dto.ProductDTO;
import org.icommerce.mapper.ProductDTOMapper;
import org.icommerce.service.ProductApplicationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/rest/api/v1/products")
@AllArgsConstructor
public class ProductController {

    private final ProductApplicationService productApplicationService;
    private final ProductDTOMapper mapper;

    @GetMapping("/search")
    public List<ProductDTO> search() {
        return mapper.map(productApplicationService.search());
    }
}
