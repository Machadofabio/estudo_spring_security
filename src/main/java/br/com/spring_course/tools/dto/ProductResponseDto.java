package br.com.spring_course.tools.dto;

import java.math.BigDecimal;

public record ProductResponseDto(Long id, String name, BigDecimal price) {
}
