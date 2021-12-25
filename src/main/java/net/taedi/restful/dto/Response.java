package net.taedi.restful.dto;

import java.io.Serializable;

public class Response implements Serializable {

    private static final long serialVersionUID = -8091879091924046844L;
    private final String token;

    public Response(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }
}