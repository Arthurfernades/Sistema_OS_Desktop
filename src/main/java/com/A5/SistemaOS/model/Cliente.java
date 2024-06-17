package com.A5.SistemaOS.model;

import com.A5.SistemaOS.model.enums.ETipoSexo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 50, nullable = false)
    private String nome;

    @Column(length = 20, nullable = false)
    private String cpf;

    private LocalDate nasc;

    @Column(length = 10, nullable = false)
    private ETipoSexo sexo;

    @Column(length = 20, nullable = false)
    private String telefone;

    private String endereco;

    private String bairro;

    private String cidade;

    private String cep;

    private String email;

//    private ArrayList<OrdemServico> listaOS;

}
