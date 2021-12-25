package net.taedi.restful.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CommonResponse {
    private String response;
    private String message;
    private Object data;

    public CommonResponse(String response, String message, Object data) {
        this.response = response;
        this.message = message;
        this.data = data;
    }

}
