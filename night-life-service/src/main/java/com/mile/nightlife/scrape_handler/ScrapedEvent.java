package com.mile.nightlife.scrape_handler;

record ScrapedEvent(
    String placeName,
    String subject,
    String description,
    byte[] data,
    String date) {}
