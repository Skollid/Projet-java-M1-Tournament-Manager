package com.supdevinci.tournamentmanager.api.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PlayerDetailDto {

    Long id;
    String pseudo;
    String postalAddress;
    List<TeamDto> teams;

}
