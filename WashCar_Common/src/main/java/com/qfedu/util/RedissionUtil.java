package com.qfedu.util;

import org.redisson.Redisson;
import org.redisson.api.RMap;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @program: WashCar
 * @description: Redission 实现Redis的操作
 * @author: Feri
 * @create: 2019-11-07 17:27
 */
public class RedissionUtil {
    private static RedissonClient client;

    static {
        Config config = new Config();
        config.useSingleServer().setAddress("redis://118.190.132.99:6379").setConnectionPoolSize(64);
        client = Redisson.create(config);
    }

    //新增
    public static void setStr(String key, String value) {
        //1、字符串类型
        client.getBucket(key).set(value);
//        //2、List
//        client.getList(key).add(value);
//        //3、Set
//        client.getSet(key).add(value);
//        //4、ZSet
//        client.getScoredSortedSet(key).add(2.3,value);
//        //5、Hash
//        client.getMap(key).put("aa",value);
//        Map<Object,Double>  ;  ZSet
    }

    public static void putHash(String key, String field, String val) {
        client.getMap(key).put(field, val);
    }

    public static void putAllHash(String key, long seconds, Map<Object, String> map) {
        RMap rm = client.getMap(key);
        if (seconds > 0) {
            rm.expire(seconds, TimeUnit.SECONDS);
        }
        rm.putAll(map);
    }

    //删除
    public static void delKey(String key) {
        client.getKeys().delete(key);
//        client.getList(key).remove();
    }

    //查询
    public static String getStr(String key) {
        return (String) client.getBucket(key).get();
    }

    public static Collection<Object> getHash(String key) {
        return client.getMap(key).values();
    }


    public static Map<Object,Object> getHashAll(String key){
        return client.getMap(key).readAllMap();
    }
    //系统
    //设置有效期
    public static void setExpire(String key, long seconds) {
        client.getKeys().expire(key, seconds, TimeUnit.SECONDS);
    }

    //开启分布式锁  setnx
    public static void lock(String key) {
//        Lock lock=new ReentrantLock();
//        lock.lock();
//        lock.unlock();
        client.getLock(key).lock();
    }

    //释放分布式锁
    public static void unlock(String key) {
        client.getLock(key).unlock();
    }

    //验证key是否存在
    public static boolean checkKey(String key) {
        return client.getKeys().countExists(key) > 0;
    }
}
