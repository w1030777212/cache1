package com.dxl;

/**
 * <p>
 *
 * </p>
 *
 * @author: dxl
 * @Time: 2022/6/7  11:10
 */
public interface ICacheEvictContext<K,V> {
    K key();
    int size();
    ICache<K,V> cache();
}
