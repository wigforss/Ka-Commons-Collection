package org.kasource.commons.collection.builder;

import java.util.HashMap;
import java.util.Map;

/**
 * Map Builder. Allows population of map entries with method chaining.
 * 
 * @code {
 *  Map<String, Object> map = new MapBuilder<String, Object>().put("A", 1).put("B", 2).build();
 * }
 * @author rikardwi
 *
 * @param <K>  Map key type
 * @param <V>  Map value type
 */
public class MapBuilder<K, V> {
    
    private Map<K, V> map;
    
    /**
     * Constructor. Uses the default map implementation (HashMap). 
     **/
    public MapBuilder() {
        map = new HashMap<K, V>();
    }
    
    /**
     * Constructor.
     * 
     * @param map Map to use.
     **/
    public MapBuilder(Map<K,V> map) {
        this.map = map;
    }
    
    /**
     * Puts a new entry into the map.
     * 
     * @param key    Entry key
     * @param value  Entry value
     * 
     * @return This builder
     **/
    public MapBuilder<K, V> put(K key, V value) {
        map.put(key, value);
        return this;
    }
    
    /**
     * Puts all entries from otherMap into the map.
     * 
     * @param otherMap Map to populate entries from.
     * 
     * @return This builder.
     **/
    public MapBuilder<K, V> putAll(Map<K, V> otherMap) {
        map.putAll(otherMap);
        return this;
    }
    
    /**
     * Returns the populated map.
     * 
     * @return the populated map.
     **/
    public Map<K, V> build() {
        return map;
    }
}
