package com.giacom.aot.basics;

import org.springframework.data.annotation.Id;

public record Customer(@Id Integer id, String name) {

}
