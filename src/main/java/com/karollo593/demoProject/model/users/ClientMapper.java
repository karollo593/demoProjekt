package com.karollo593.demoProject.model.users;

public class ClientMapper {
    public static ClientDTO toDTO(Client client){
        ClientDTO dto = new ClientDTO();
        dto.setDetails(client.getDetails());
        dto.setFirstName(client.getFirstName());
        dto.setId(client.getId());
        dto.setLastName(client.getLastName());
        dto.setRole(client.getRole());

        return dto;
    }

    public static Client toEntity(ClientDTO dto){
        Client entity = new Client();
        entity.setDetails(dto.getDetails());
        entity.setFirstName(dto.getFirstName());
        entity.setLastName(dto.getLastName());
        entity.setId(dto.getId());
        entity.setRole(dto.getRole());

        return entity;
    }
}
