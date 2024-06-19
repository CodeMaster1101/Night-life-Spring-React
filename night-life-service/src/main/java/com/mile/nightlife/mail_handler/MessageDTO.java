package com.mile.nightlife.mail_handler;

record MessageDTO(
    String sender,
    String subject,
    String description,
    byte[] data,
    String date) {}
