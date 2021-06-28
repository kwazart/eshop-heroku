package com.polozov.eshopheroku.service;

import com.polozov.eshopheroku.domain.User;

public interface MailSenderService {
    void sendActivateCode(User user);
}
