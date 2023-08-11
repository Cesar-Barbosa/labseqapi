package com.seqlab;

import java.util.concurrent.ConcurrentHashMap;

public class CacheSeqLab {

    private final ConcurrentHashMap<Long, Long> cacheStore;

    public CacheSeqLab() {
        this.cacheStore = new ConcurrentHashMap<>();
    }

    public boolean containsKey(Long key) {
        return this.cacheStore.containsKey(key);
    }

    public Long get(Long key) {
        return this.cacheStore.get(key);
    }

    public void put(Long key, Long value) {
        this.cacheStore.put(key, value);
    }
    
    public void clear() {
        this.cacheStore.clear();
    }
}
