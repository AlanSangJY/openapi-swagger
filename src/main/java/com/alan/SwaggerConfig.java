package com.alan;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(
                title = "My title",
                description = "My description",
                version = "0.0.1",
                contact = @Contact(name = "My contact name", email = "My contact email"),
                license = @License(name = "MIT License", url = "License url")
        ),
        security = @SecurityRequirement(
                name = "bearerAuth",
                scopes = {}
        )
)
@SecurityScheme(type = SecuritySchemeType.HTTP, name = "bearerAuth", scheme = "bearer")
@Configuration
public class SwaggerConfig {
    
}
