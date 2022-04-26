package com.craig.pe.contractfirstwebflux.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "clients")
@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClientDto {
    @Id
    private String id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String clientIdentityType;
    private String clientIdentityNumber;
    private String clientType;
}
