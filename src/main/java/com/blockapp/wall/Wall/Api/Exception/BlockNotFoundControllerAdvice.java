package com.blockapp.wall.Wall.Api.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BlockNotFoundControllerAdvice {
    @ExceptionHandler(BlockNotFoundException.class)
    public ResponseEntity<ApiError> handleBlockNotFoundException(BlockNotFoundException blockNotFoundException) {
        return new ResponseEntity<>(new ApiError(blockNotFoundException.getMessage(), HttpStatus.NOT_FOUND), HttpStatus.NOT_FOUND);
    }
}
