package com.jackson.serialization;

import java.util.ArrayList;
import java.util.List;

public class Response {

	private List<Item> dados = new ArrayList<Item>();
	
	
	public List<Item> getDados() {
		return dados;
	}
	public void setDados(List<Item> dados) {
		this.dados = dados;
	}
}
