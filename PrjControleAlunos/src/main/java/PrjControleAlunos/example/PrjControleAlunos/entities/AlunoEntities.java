package PrjControleAlunos.example.PrjControleAlunos.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

		@Entity
		@Table(name = "aluno")
		public class AlunoEntities{
			
			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			private Long id;
			
			@Column(name = "nome")
			private String nome;
			
			@Column(name = "cpf")
			private int cpf;
			
			public Long getId() {
				return id;
			}
			
			public void setId(Long id) {
				this.id = id;
			}
			
			public String getName() {
				return nome;
			}
			
			public void setName(String nome) {
				this.nome = nome;
			}
			
			public double getCpf() {
				return cpf;
			}
			
			public void setCpf(int cpf) {
				this.cpf = cpf;
			}
		
	}