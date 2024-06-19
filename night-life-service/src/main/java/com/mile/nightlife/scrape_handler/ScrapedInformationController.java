package com.mile.nightlife.scrape_handler;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/api/v1/event-information")
final class ScrapedInformationController {

  private final ScrapeHandlerService service;

  ScrapedInformationController(ScrapeHandlerService service) {
    this.service = service;
  }

  @PostMapping
  public void getScrapedInformation(@RequestBody Set<ScrapedEvent> eventInformation) {
    service.updateEvents(eventInformation);
  }

}
