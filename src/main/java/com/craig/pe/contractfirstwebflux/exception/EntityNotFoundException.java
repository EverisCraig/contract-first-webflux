package com.craig.pe.contractfirstwebflux.exception;

import com.craig.pe.contractfirstwebflux.util.I18AbleException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EntityNotFoundException extends I18AbleException {
    public EntityNotFoundException(String key,Object... localMessage) {
        super(key,localMessage);
    }
}
