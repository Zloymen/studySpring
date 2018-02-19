package test.spring;

import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.concurrent.ConcurrentMapCacheFactoryBean;
import org.springframework.context.support.GenericXmlApplicationContext;
import test.spring.service.TestCacheServiceImpl;

public class CacheApp {

    public static void main( String[] args ){
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("cacheContext.xml");
        ctx.refresh();

        Object objectCache = ctx.getBean(ConcurrentMapCacheFactoryBean.class);
        ConcurrentMapCacheFactoryBean cache = (ConcurrentMapCacheFactoryBean) objectCache;

        ConcurrentMapCache mapCache = cache.getObject();

        Object objectService = ctx.getBean(TestCacheServiceImpl.class);
        TestCacheServiceImpl cacheService = (TestCacheServiceImpl) objectService;

        long begin = System.currentTimeMillis();
        System.out.println("print without cacheble");
        for(int i= 0; i < 3; i++){
            cacheService.getValue(0);
            long current = System.currentTimeMillis();
            System.out.println("get value - " + (current - begin));
            begin = current;
        }

        begin = System.currentTimeMillis();
        System.out.println("print with cacheble");
        for(int i= 0; i < 3; i++){
            cacheService.getCacheValue(0);
            long current = System.currentTimeMillis();
            System.out.println("get value - " + (current - begin));
            begin = current;
        }


        cacheService.getCacheValue2("test");

        System.out.println("CachePut");

        System.out.println("CachePut1");
        cacheService.getCachePut("test ");
        System.out.println("size cache = " + mapCache.getNativeCache().size());
        printCache(mapCache);

        System.out.println("CachePut1");
        cacheService.getCachePut("test ");
        System.out.println("size cache = " + mapCache.getNativeCache().size());
        printCache(mapCache);

        System.out.println("CachePut1");
        cacheService.getCachePut("test ");
        System.out.println("size cache = " + mapCache.getNativeCache().size());
        printCache(mapCache);


        System.out.println("Cache before Evict");
        System.out.println("size cache = " + mapCache.getNativeCache().size());
        printCache(mapCache);
        cacheService.getEvict(666);

        System.out.println("Cache after Evict");
        System.out.println("size cache = " + mapCache.getNativeCache().size());
        printCache(mapCache);

        //System.out.println(mapCache.get(0, Integer.class));

        ctx.close();
    }

    private static void printCache(ConcurrentMapCache mapCache){
        mapCache.getNativeCache().entrySet().forEach(item -> System.out.println(item.getKey() +" : " + item.getValue()));
    }
}
