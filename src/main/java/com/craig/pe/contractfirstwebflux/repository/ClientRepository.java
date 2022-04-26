package com.craig.pe.contractfirstwebflux.repository;

import com.craig.pe.contractfirstwebflux.model.ClientDto;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface ClientRepository extends IRepository<ClientDto, String> {
    Mono<ClientDto> findByName(String name);
    Mono<ClientDto> findByClientIdentityNumber(String clientIdentityNumber);
}
