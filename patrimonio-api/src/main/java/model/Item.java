package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "item")
public class Item {
	
	@Id //id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Estrategia Identificação para geração do ID
	private Long id;
	private String etiqueta;
	
	// Anotação de validação - not Empty
    @Column(name="descricao") 
	private String descricao;
    
//    @Column(name="dataAquisicao") 
//    private LocalDate dataAquisicao;

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getEtiqueta() {
	return etiqueta;
}
public void setEtiqueta(String etiqueta) {
	this.etiqueta = etiqueta;
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Item other = (Item) obj;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	return true;
}
//
//public LocalDate getDataAquisicao() {
//	return dataAquisicao;
//}
//
//public void setDataAquisicao(LocalDate dataAquisicao) {
//	this.dataAquisicao = dataAquisicao;
//}

	
	
}
