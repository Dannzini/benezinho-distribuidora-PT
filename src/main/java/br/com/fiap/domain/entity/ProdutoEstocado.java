package br.com.fiap.domain.entity;

import java.time.LocalDateTime;
import java.util.Locale;

public class ProdutoEstocado {

    long id;

    Produto produto;

    Deposito deposito;

    String numeroDeSerie;

    LocalDateTime entrada;

    LocalDateTime saida;
}
