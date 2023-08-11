package com.seqlab;

import org.springframework.stereotype.Service;

@Service
public class LabseqService {

    private final CacheSeqLab cacheStore = new CacheSeqLab();

    public long calculate(long n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input value cannot be negative.");
        }

        if (n == 0) return 0;
        if (n == 1 || n == 3) return 1;
        if (n == 2) return 0;

        if (cacheStore.containsKey(n)) {
            return cacheStore.get(n);
        }

        long result = calculate(n - 4) + calculate(n - 3);
        cacheStore.put(n, result);
        return result;
    }
    
    public void clearCache() {
        cacheStore.clear();
    }
}
