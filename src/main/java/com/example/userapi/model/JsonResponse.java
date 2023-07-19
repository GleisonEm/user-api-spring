package com.example.userapi.model;

public class JsonResponse {
    private final String message;

    public String getMessage() {
        return message;
    }

    public JsonResponse(String message) {
        this.message = message;
    }
}