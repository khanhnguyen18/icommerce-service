package org.icommerce.rest;

import lombok.AllArgsConstructor;
import org.icommerce.dto.ProductCriteriaDTO;
import org.icommerce.dto.ProductDTO;
import org.icommerce.dto.UpdatePriceDTO;
import org.icommerce.mapper.ProductCriteriaMapper;
import org.icommerce.mapper.ProductDTOMapper;
import org.icommerce.service.ProductApplicationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/rest/api/v1/products")
@AllArgsConstructor
public class ProductController {

    private final ProductApplicationService productApplicationService;
    private final ProductDTOMapper mapper;
    private final ProductCriteriaMapper productCriteriaMapper;

    @PostMapping("/search")
    public List<ProductDTO> search(@RequestBody ProductCriteriaDTO productCriteria) {
        return mapper.map(productApplicationService.search(productCriteriaMapper.map(productCriteria)));
    }

    @PutMapping("/update-price")
    public void updatePrice(@RequestBody UpdatePriceDTO updatePriceDTO) {
        productApplicationService.updatePrice(updatePriceDTO.getProductId(), updatePriceDTO.getPrice());
    }

    @GetMapping("/{id}/detail")
    public ProductDTO getById(@PathVariable("id") Long id) {
        return mapper.map(productApplicationService.getDetail(id));
    }
}
