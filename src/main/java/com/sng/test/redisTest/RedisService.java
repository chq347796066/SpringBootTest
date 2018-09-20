package com.sng.test.redisTest;

public interface RedisService {
    public boolean set(String key, String value);
    String get(String key);
    boolean expire(String key, long expire);
    boolean remove(String key);
}
