package com.mile.nightlife.inject;

import com.mile.nightlife.global.entities.Club;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
final class CreateClubMapper {

  Club convertFromDTO(CreateClubDTO createClubDTO) {
    return new Club(
      null,
      createClubDTO.name(),
      createClubDTO.email(),
      createClubDTO.genre(),
      createClubDTO.averageCost(),
      createClubDTO.address(),
      createClubDTO.latitude(),
      createClubDTO.longitude(),
      createClubDTO.type(),
      new HashSet<>()
    );
  }

  CreateClubDTO convertToDTO(Club club) {
    return new CreateClubDTO(
        club.getName(),
        club.getEmail(),
        club.getGenre(),
        club.getAverageCost(),
        club.getAddress(),
        club.getLatitude(),
        club.getLongitude(),
        club.getType()
    );
  }

}
