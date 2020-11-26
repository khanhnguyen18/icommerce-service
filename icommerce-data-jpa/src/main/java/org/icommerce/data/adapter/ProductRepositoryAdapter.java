package org.icommerce.data.adapter;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.icommerce.data.jpa.entity.PriceEntity;
import org.icommerce.data.jpa.entity.ProductEntity;
import org.icommerce.data.jpa.repository.ProductJpaRepository;
import org.icommerce.data.jpa.spec.ProductSpecificationBuilder;
import org.icommerce.data.mapper.ProductDataMapper;
import org.icommerce.domain.entity.Product;
import org.icommerce.domain.repository.ProductRepository;
import org.icommerce.domain.vo.ProductCriteria;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class ProductRepositoryAdapter implements ProductRepository {

    ProductJpaRepository productJpaRepository;
    ProductDataMapper mapper;
    ProductSpecificationBuilder productSpecificationBuilder;

    @Override
    public Product getDetail(Long id) {
        return mapper.map(productJpaRepository.getById(id));
    }


    @Override
    public void updatePrice(Long productId, double price) {
        ProductEntity product = productJpaRepository.getById(productId);
        PriceEntity priceEntity = new PriceEntity();
        priceEntity.setAmount(price);
        priceEntity.setProduct(product);
        priceEntity.setDate(LocalDateTime.now());
        product.getPrices().add(priceEntity);
        productJpaRepository.save(product);
    }

    @Override
    public List<Product> search(ProductCriteria productCriteria) {
        return mapper.mapList(
                productJpaRepository.findAll(productSpecificationBuilder.build(productCriteria))
        );
    }


}
