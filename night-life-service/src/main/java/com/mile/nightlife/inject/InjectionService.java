package com.mile.nightlife.inject;

import com.mile.nightlife.base.BaseFacade;
import com.mile.nightlife.global.entities.Club;
import org.springframework.stereotype.Service;

@Service
final class InjectionService {

  private final BaseFacade baseFacade;
  private final CreateClubMapper clubMapper;

  InjectionService(BaseFacade baseFacade, CreateClubMapper clubMapper) {
    this.baseFacade = baseFacade;
    this.clubMapper = clubMapper;
  }

  CreateClubDTO createNewClub(CreateClubDTO createClubDTO) {
    Club club = baseFacade.createNewClub(clubMapper.convertFromDTO(createClubDTO));
    return clubMapper.convertToDTO(club);
  }
}
