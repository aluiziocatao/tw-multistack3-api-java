package br.com.treinaweb.adoteumpet.core.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Pet {
    
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String historia;
    
    @Column(nullable = false)
    private String foto;

    public Long getId() {
        return null;
    }

    public String getNome() {
        return null;
    }

    public String getHistoria() {
        return null;
    }

    public String getFoto() {
        return null;
    }

    public void setFoto(String string) {
    }

    public void setHistoria(String string) {
    }

    public void setNome(String string) {
    }

    
}
