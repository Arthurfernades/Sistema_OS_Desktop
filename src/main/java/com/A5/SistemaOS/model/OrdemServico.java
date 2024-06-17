package com.A5.SistemaOS.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdemServico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Timestamp inicio;

    private Timestamp fim;

    @OneToOne
    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionario;

    @OneToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @Column(length = 200, nullable = false)
    private String descricao;

    private double valor;

    @Column(length = 20, nullable = false)
    private String protocolo;

    public void iniciar() {
        inicio = Timestamp.valueOf(LocalDateTime.now());
    }

    public void finalizar() {
        fim = Timestamp.valueOf(LocalDateTime.now());
    }

    public void setProtocolo() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        this.protocolo = sdf.format(inicio);
    }

}
