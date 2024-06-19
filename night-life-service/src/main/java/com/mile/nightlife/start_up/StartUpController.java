package com.mile.nightlife.start_up;

import com.mile.nightlife.base.BaseFacade;
import com.mile.nightlife.global.dto.TypedCoordinates;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("api/v1/server-boot")
final class StartUpController {

  private final BaseFacade baseFacade;

  StartUpController(BaseFacade baseFacade) {
    this.baseFacade = baseFacade;
  }

  @GetMapping("/coordinates")
  public Set<TypedCoordinates> getCoordinates() {
    return baseFacade.getAllClubsCoordinates();
  }

}
