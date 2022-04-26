package com.craig.pe.contractfirstwebflux.service;

import com.craig.contractfirstwebflux.api.RegisterApiDelegate;
import com.craig.contractfirstwebflux.model.Client;
import com.craig.pe.contractfirstwebflux.exception.EntityNotFoundException;
import com.craig.pe.contractfirstwebflux.model.ClientDto;
import com.craig.pe.contractfirstwebflux.repository.ClientRepository;
import com.craig.pe.contractfirstwebflux.repository.IRepository;
import com.craig.pe.contractfirstwebflux.util.ClientMessage;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

//@Service
//public class ClientService extends BaseService<ClientDto, String> implements IClientService {
//    private final ClientRepository clientRepository;
//    private final ClientMessage clientMessage;
//
//    public ClientService(ClientRepository clientRepository,ClientMessage clientMessage) {
//        this.clientRepository = clientRepository;
//        this.clientMessage=clientMessage;
//    }
//
//    @Override
//    protected IRepository<ClientDto, String> getRepository() {
//        return clientRepository;
//    }
//
//    @Override
//    public Mono<ClientDto> findByName(String name) {
//        Mono<ClientDto> clientDtoMono=clientRepository.findByName(name);
//        return clientDtoMono.hasElement().flatMap(aBoolean -> {
//            if (Boolean.TRUE.equals(aBoolean)){
//                return  clientDtoMono;
//            }else{
//                return Mono.error(() -> new EntityNotFoundException(clientMessage.getLocalMessage("entity.client.notNamePresent")));
//            }
//        });
//    }
//
//    @Override
//    public Mono<ClientDto> findByClientIdentityNumber(String clientIdentityNumber) {
//        return clientRepository.findByClientIdentityNumber(clientIdentityNumber);
//    }
//}
@Service
public class ClientService implements RegisterApiDelegate {

    @Override
    public ResponseEntity<Client> registerPost(Client body) {
        return null;
    }
}