package com.jackson.serialization;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	
	public static void main(String[] args) {
		String json = "{\r\n" + 
				"  \"status\": true,\r\n" + 
				"  \"return\": \"OK\",\r\n" + 
				"  \"imagem_status\": \"http:\\/\\/www2.correios.com.br\\/home2014\\/img\\/SRO\\/entrega.gif\",\r\n" + 
				"  \"result\": [\r\n" + 
				"    {\r\n" + 
				"      \"data\": \"19\\/07\\/2019 12:36\",\r\n" + 
				"      \"local\": \"TABOAO DA SERRA \\/ SP\",\r\n" + 
				"      \"retorno\": \"Objeto entregue ao destinatário\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"data\": \"19\\/07\\/2019 11:12\",\r\n" + 
				"      \"local\": \"TABOAO DA SERRA \\/ SP\",\r\n" + 
				"      \"retorno\": \"Objeto saiu para entrega ao destinatário\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"data\": \"18\\/07\\/2019 18:42\",\r\n" + 
				"      \"local\": \"TABOAO DA SERRA \\/ SP\",\r\n" + 
				"      \"retorno\": \"Tentativa de entrega não efetuada Entrega prevista para o próximo dia útil\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"data\": \"18\\/07\\/2019 15:04\",\r\n" + 
				"      \"local\": \"TABOAO DA SERRA \\/ SP\",\r\n" + 
				"      \"retorno\": \"Objeto saiu para entrega ao destinatário\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"data\": \"15\\/07\\/2019 21:01\",\r\n" + 
				"      \"local\": \"TABOAO DA SERRA \\/ SP\",\r\n" + 
				"      \"retorno\": \"Tentativa de entrega não efetuada Entrega prevista para o próximo dia útil\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"data\": \"15\\/07\\/2019 14:05\",\r\n" + 
				"      \"local\": \"TABOAO DA SERRA \\/ SP\",\r\n" + 
				"      \"retorno\": \"Objeto saiu para entrega ao destinatário\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"data\": \"12\\/07\\/2019 23:57\",\r\n" + 
				"      \"local\": \"SAO PAULO \\/ SP\",\r\n" + 
				"      \"retorno\": \"Objeto encaminhado de Unidade de Tratamento em SAO PAULO \\/ SP para Unidade de Distribuição em TABOAO DA SERRA \\/ SP\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"data\": \"12\\/07\\/2019 15:31\",\r\n" + 
				"      \"local\": \"SAO PAULO \\/ SP\",\r\n" + 
				"      \"retorno\": \"Objeto encaminhado de Agência dos Correios em SAO PAULO \\/ SP para Unidade de Tratamento em SAO PAULO \\/ SP\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"data\": \"12\\/07\\/2019 15:25\",\r\n" + 
				"      \"local\": \"SAO PAULO \\/ SP\",\r\n" + 
				"      \"retorno\": \"Objeto postado\"\r\n" + 
				"    }\r\n" + 
				"  ]\r\n" + 
				"}";
		
		ObjectMapper om = new ObjectMapper();
		try {
			Response res =  om.readValue(json, Response.class);
			
			for(Item i : res.getResult()) {
				System.out.println(i.getData().toString());
				System.out.println(i.getMsg());
			}
			
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
