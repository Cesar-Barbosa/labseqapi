package com.mycompany;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class LabseqService {

    private final Map<Long, Long> cache = new HashMap<>();

    public long calculate(long n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input value cannot be negative");
        }

        if (n == 0) return 0;
        if (n == 1 || n == 3) return 1;
        if (n == 2) return 0;

        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        long result = calculate(n - 4) + calculate(n - 3);
        cache.put(n, result);
        return result;
    }
}
