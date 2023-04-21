package com.reto.nttData.domain.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClientDTO extends PersonDTO {
    private Long clientId;
    private String password;
    private Boolean status;
    private List<AccountDTO> accounts;
}
