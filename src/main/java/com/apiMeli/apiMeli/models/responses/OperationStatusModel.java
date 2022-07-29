package com.apiMeli.apiMeli.models.responses;

/**
 * Clase encargada de dar respuesta del status ante una accion generada
 * @author Barbara
 *
 */
public class OperationStatusModel {

    private String name;
    private String result;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResult() {
        return this.result;
    }

    public void setResult(String result) {
        this.result = result;
    }

}
