package com.craig.pe.contractfirstwebflux.service;

import com.craig.pe.contractfirstwebflux.model.ClientDto;
import reactor.core.publisher.Mono;

public interface IClientService extends IBaseService<ClientDto, String> {

    Mono<ClientDto> findByName(String name);
    Mono<ClientDto> findByClientIdentityNumber(String  clientIdentityNumber);
}
