package com.dxl;

/**
 * <p>
 *
 * </p>
 *
 * @author: dxl
 * @Time: 2022/6/7  11:11
 */
public class CacheEvictContext<K,V> implements ICacheEvictContext{
    private K key;
    private int size;
    private ICache<K,V> cache;

    @Override
    public K key() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public ICache cache() {
        return null;
    }

    public CacheEvictContext<K,V> cache(ICache<K, V> cache) {
        this.cache = cache;
        return this;
    }

    public CacheEvictContext<K,V> size(int size) {
        this.size = size;
        return this;
    }

    public CacheEvictContext<K,V> key(K key) {
        this.key = key;
        return this;
    }
}
