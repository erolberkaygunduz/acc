package com.berkaygunduz.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RunwaysDTO {

    private Integer id;
    private Integer airport_ref;
    private String airport_ident;
}
