package com.example.pasteleria_backend;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
    info = @Info(
        title = "API REST - Pastelería Mil Sabores",
        version = "1.0.0",
        description = "Documentación oficial de endpoints para la gestión de catálogo, categorías y operaciones de la plataforma e-commerce Pastelería Mil Sabores.",
        contact = @Contact(
            name = "Equipo de Desarrollo - Duoc UC",
            email = "contacto@milsabores.cl"
        )
    )
)
public class PasteleriaBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(PasteleriaBackendApplication.class, args);
    }
}