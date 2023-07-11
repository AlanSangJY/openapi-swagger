package com.alan.controller;

import com.alan.entity.Param;
import com.alan.entity.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Test controller", description = "This is my test controller")
public class TestController {
    @GetMapping(value = "/common", produces = MediaType.APPLICATION_JSON_VALUE)
    public String test() {
        return "Access successful";
    }

    @PostMapping(value = "/annotation", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(description = "This is annotation description", summary = "This is annotation summary")
    public Result testAnnotation(Param param) {
        return new Result();
    }
}
