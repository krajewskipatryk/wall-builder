package com.blockapp.wall.Wall.Api.Exception;

import org.springframework.http.HttpStatus;

public record ApiError(String message, HttpStatus status) {
}
