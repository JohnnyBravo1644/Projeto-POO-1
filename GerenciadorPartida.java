package com.cluberegatasflamengo;

import java.time.LocalDate;

public interface GerenciadorPartida {
    
    Partida iniciarPartida(String nomeAdversario, LocalDate dataPartida, Atleta[] atletas);

    TipoEvento registrarEvento(TipoEvento tipoEvento);

    Atleta ImprimirEstatistica(Atleta[] atletas);
}
