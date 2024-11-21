package br.com.ariel.Screenmatch.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
