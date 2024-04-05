package com.stefanydev.screenmatch.service;

public interface DataTransform {
    // <T> T - é o generics do Java que serve para indicar que vai ter um retorno e não sabemos o tipo.
    <T> T getData(String json, Class<T> tClass);
}
