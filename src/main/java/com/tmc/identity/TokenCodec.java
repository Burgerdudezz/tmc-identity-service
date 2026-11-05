package com.tmc.identity;

import java.time.Instant;

public interface TokenCodec {
    String issue(Employee employee, Instant expiresAt);
    Credential read(String token);

    record Credential(int employeeId, int factoryId, String tokenId, Instant expiresAt) {}
}
