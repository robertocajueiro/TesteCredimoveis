package com.testecredimoveis.domain.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

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
	
	@JsonFormat(pattern = "dd/MM/yyyy")	
	private LocalDate dt_emissao;

}
