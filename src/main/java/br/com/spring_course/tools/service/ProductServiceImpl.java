package br.com.spring_course.tools.service;

import br.com.spring_course.tools.dto.ProductRequestDto;
import br.com.spring_course.tools.dto.ProductResponseDto;
import br.com.spring_course.tools.exceptions.DataNotFoundException;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    public List<ProductResponseDto> productList = List.of(new ProductResponseDto(1L, "Iphone 17", BigDecimal.valueOf(10000.00)),
            new ProductResponseDto(2L, "Playstation 5", BigDecimal.valueOf(5000.00)));

    @Override
    public List<ProductResponseDto> getProductList() {
        return productList;
    }

    @Override
    public List<ProductResponseDto> addProductOnProductList(ProductRequestDto productRequestDto) {
        List<ProductResponseDto> unsortedProductList = productList;
        Long lastIndexOfList = unsortedProductList.stream()
                .sorted(Comparator.comparing(ProductResponseDto::id).reversed())
                .map(ProductResponseDto::id)
                .findFirst()
                .orElseThrow(() -> new DataNotFoundException("Id nao encontrado"));

        ProductResponseDto newProduct = new ProductResponseDto(lastIndexOfList + 1, productRequestDto.name(), productRequestDto.price());
        unsortedProductList.add(newProduct);
        return unsortedProductList;
    }
}
