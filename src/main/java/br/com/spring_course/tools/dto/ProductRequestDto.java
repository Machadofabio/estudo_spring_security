package br.com.spring_course.tools.dto;

import java.math.BigDecimal;

public record ProductRequestDto(String name, BigDecimal price) {
}
