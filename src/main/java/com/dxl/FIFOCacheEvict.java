package com.dxl;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <p>
 *
 * </p>
 *
 * @author: dxl
 * @Time: 2022/6/7  11:16
 */
public class FIFOCacheEvict<K,V> implements CacheEivct<K,V>{
    private Queue<K> queue = new LinkedList<>();
    @Override
    public void eivct(ICacheEvictContext<K,V> context) {
        ICache cache = context.cache();
        if (cache.size()>=context.size()){
            K evictKey = queue.remove();
            cache.remove(evictKey);
        }
        K key = context.key();
        queue.add(key);
    }
}
