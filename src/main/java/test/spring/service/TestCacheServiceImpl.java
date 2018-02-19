package test.spring.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

public class TestCacheServiceImpl implements ITestCacheService {

    public Long getValue(Integer k){

        sleep(1000L);
        return System.currentTimeMillis();
    }

    @Cacheable("items")
    public Long getCacheValue(Integer k){
        return getValue(k);
    }

    @Cacheable("items")
    public String getCacheValue2(String k){
        return k.toUpperCase();
    }

    @CachePut("items")
    public String getCachePut(String k){
        sleep(10L);
        return k + System.currentTimeMillis();
    }

    @CacheEvict(value = "items", allEntries = true)
    public String getEvict(Integer k){
        return String.valueOf(k);
    }


    private void sleep(long time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
