/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Definitiva;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.json.simple.*;

/**
 *
 * @author Karen Marín Angel
 * @author Victor Santiago Morales
 * @author Eduardo Cadavid García   
 */
@WebService(serviceName = "Definitiva")
public class Definitiva {

    /**
     * Web service operation
     * @param nota1
     * @param nota2
     * @param nota3
     * @return Definitiva
     */
    @WebMethod(operationName = "getNotas")
    public String getNotas(@WebParam(name = "nota1") double nota1, @WebParam(name = "nota2") double nota2, @WebParam(name = "nota3") double nota3) {
        double definitiva = (nota1+nota2+nota3) / 3;
        JSONObject nota = new JSONObject();
        JSONObject estado = new JSONObject();
        if (definitiva >=3){
            estado.put("estado", "Aprobado");
            nota.put("definitiva", Math.round(definitiva*100.0)/100.0);
        }else{
            estado.put("estado", "Reprobado");
            nota.put("definitiva", Math.round(definitiva*100.0)/100.0);
        }
        JSONArray resultado = new JSONArray();
        resultado.add(estado);
        resultado.add(nota);
        return resultado.toString();
    }

    /**
     * This is a sample web service operation
     */

}
