package com.rangelmrk.forumhub.domain.topico;





import java.time.LocalDateTime;


public record DadosDetalhamentoTopico(
        Long id,
        String titulo,
        String mensagem,
        LocalDateTime dataCriacao,
        String status,
        String autor,
        String curso) {
    public DadosDetalhamentoTopico(Topico topico){
        this( topico.getId(),
                topico.getTitulo(),
                topico.getMensagem(),
                topico.getDataCriacao(),
                topico.getStatus() ? "Ativo" : "Inativo",
                topico.getAutor().getNome(),
                topico.getCurso().getNome());
    }
}
