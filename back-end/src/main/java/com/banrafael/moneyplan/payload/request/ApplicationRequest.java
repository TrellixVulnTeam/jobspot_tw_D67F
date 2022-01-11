package com.banrafael.moneyplan.payload.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor

public class ApplicationRequest {
    @NotBlank
    private String job_id;

    @NotBlank
    private String user_id;
}
