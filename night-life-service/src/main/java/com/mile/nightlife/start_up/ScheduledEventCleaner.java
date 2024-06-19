package com.mile.nightlife.start_up;

import com.mile.nightlife.base.BaseFacade;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;

@Service
final class ScheduledEventCleaner {

  private final BaseFacade baseFacade;

  ScheduledEventCleaner(BaseFacade baseFacade) {
    this.baseFacade = baseFacade;
  }

  @Scheduled(fixedRate = 600000)
  public void clearEventsEveryDay() {
    Date date = Date.valueOf(LocalDate.now());
    baseFacade.removeOutdatedEvents(date);
  }

}
