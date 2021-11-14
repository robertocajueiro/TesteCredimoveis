package com.testecredimoveis.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
@Entity
@Table(schema = "nf", name = "tbl_nfe")
public class Nota {
	
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_nfe;
	
	private String cod_mod_doc_fiscal;
	private Long numero_nfe;
	private String status_nfe;
	private String acsys_usr;

}
