package br.com.Generation.Blog.BlogPessoal.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

		//transforma o objeto de postagem em uma tabela no banco de dados
		@Entity

		//da o nome para a tabela no banco de dados
		@Table(name="tb_postagem")

	public class Postagem {
	
		//define a chave primaria da tabela
		@Id 
	
		//define que o campo id vai ser auto-increment
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
			
		//notnull indica o titulo como um campo obrigatório
		@NotNull
	
		@Size(min = 1,max = 50)
		
	private String titulo;
	
		@NotNull
		
		@Size(min = 1,max = 500)

	private String texto;
	
		//pega a hora automaticamente do seu computador
		@UpdateTimestamp
	
	private Date data;
	//private LocalDateTime data;

		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public String getTexto() {
			return texto;
		}
		public void setTexto(String texto) {
			this.texto = texto;
		}
		public Date getData() {
			return data;
		}
		public void setData(Date data) {
			this.data = data;
	}
}
