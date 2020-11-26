package org.icommerce.rest;

import lombok.AllArgsConstructor;
import org.icommerce.dto.ProductCriteriaDTO;
import org.icommerce.dto.ProductDTO;
import org.icommerce.mapper.ProductCriteriaMapper;
import org.icommerce.mapper.ProductDTOMapper;
import org.icommerce.service.ProductApplicationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;


@RestController
@RequestMapping("/rest/api/v1/products")
@AllArgsConstructor
public class ProductController {

    private final ProductApplicationService productApplicationService;
    private final ProductDTOMapper mapper;
    private final ProductCriteriaMapper productCriteriaMapper;

    @GetMapping("/search")
    public List<ProductDTO> search(ProductCriteriaDTO criteriaDTO) {
        return mapper.map(productApplicationService.search(productCriteriaMapper.map(criteriaDTO)));
    }

    @GetMapping("/{id}/detail")
    public ProductDTO getById(@PathVariable("id") Long id) {
        return mapper.map(productApplicationService.getDetail(id));
    }
}
