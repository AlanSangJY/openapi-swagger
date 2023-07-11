package com.alan.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class Param {
    @Schema(description = "this is param id", example = "111")
    private String paramId;
    private String content;
}
