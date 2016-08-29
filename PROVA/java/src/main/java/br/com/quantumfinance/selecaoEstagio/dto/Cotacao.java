package br.com.quantumfinance.selecaoEstagio.dto;

import java.util.Date;

/**
 * @author Quantum Finance
 */
public class Cotacao 
{
	String nome;
	Date data;
	Float fechamento;
	Long volume;

	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	public Date getData() 
	{
		return data;
	}
	public void setData(Date data) 
	{
		this.data = data;
	}
	
	public Float getFechamento() 
	{
		return fechamento;
	}
	public void setFechamento(Float fechamento) 
	{
		this.fechamento = fechamento;
	}
	
	public Long getVolume() 
	{
		return volume;
	}
	public void setVolume(Long volume) 
	{
		this.volume = volume;
	}

}
