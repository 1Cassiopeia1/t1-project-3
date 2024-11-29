package ru.t1.unlock.service;

public interface UnlockService {
    boolean unlockAccount(Long accountId);

    boolean unlockClient(Long clientId);
}
