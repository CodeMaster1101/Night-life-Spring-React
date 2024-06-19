package com.mile.mail.server.service;

final class EmailFetchingException extends RuntimeException {

    EmailFetchingException(String msg, Throwable e) {
      super(msg, e);
    }

}
