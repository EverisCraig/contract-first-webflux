package com.craig.pe.contractfirstwebflux.mapper;

import com.craig.contractfirstwebflux.model.Client;
import com.craig.pe.contractfirstwebflux.model.ClientDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ClientMapper {

    @Mappings({

    })
    Client toClient(ClientDto clientDto);

    @Mappings({

    })
    ClientDto toClientDto(Client client);
}
