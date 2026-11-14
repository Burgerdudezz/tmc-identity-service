package com.tmc.identity;

import java.time.Instant;

public record QRCode(String token, Instant expiresAt) {}
