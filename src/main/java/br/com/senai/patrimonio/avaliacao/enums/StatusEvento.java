package br.com.senai.patrimonio.avaliacao.enums;

public enum StatusEvento {
    EVENTOPLANEJADO ("Evento Planejado", 0),
    INCRICOESABERTAS ("Inscrições Abertas", 200),
    EVENTOEMANDAMENTO ("Evento em andamento", 0 ),
    EVENTOENCERRADO ("Evento Encerrado", 0),
    EVENTOCANCELADO ("Enevento Cancelado", 0);

    private final String descricao;
    private  final double codigo;

    StatusEvento (String descricao, int codigo){
        this.descricao = descricao;
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getCodigo() {
        return codigo;
    }
}

