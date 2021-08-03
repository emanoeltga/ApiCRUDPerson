package com.correia.personapi.dto.response;


import lombok.Data;

@Data
public class MessageResponseDTO {

    private String message;

    public static class Builder{
        private String message;

        public Builder(String message) {
            this.message=message;
        }
        public Builder message(Long id){
            this.message = message + id.toString();
            return this;
        }
        public MessageResponseDTO builder(){
            return new MessageResponseDTO(this);
        }

    }
    public MessageResponseDTO(Builder builder){
        message=builder.message;
    }
}
