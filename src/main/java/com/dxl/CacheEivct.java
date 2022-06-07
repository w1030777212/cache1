package com.dxl;

/**
 * <p>
 *
 * </p>
 *
 * @author: dxl
 * @Time: 2022/6/7  11:08
 */
public interface CacheEivct<K,V> {
    public void eivct(ICacheEvictContext<K,V> cacheEvictContext);
}
