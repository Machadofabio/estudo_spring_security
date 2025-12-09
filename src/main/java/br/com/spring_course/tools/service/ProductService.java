package br.com.spring_course.tools.service;

import br.com.spring_course.tools.dto.ProductRequestDto;
import br.com.spring_course.tools.dto.ProductResponseDto;

import java.util.List;

public interface ProductService {

    List<ProductResponseDto> getProductList();

    List<ProductResponseDto> addProductOnProductList(ProductRequestDto productRequestDto);
}
