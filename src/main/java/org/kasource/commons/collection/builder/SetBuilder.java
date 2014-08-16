package org.kasource.commons.collection.builder;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Set builder. Allows populating a set with method chaining.
 * 
 * {@code
 * Set<String> set = new SetBuilder<String>().add("A").add("B").add("B").build();
 * }
 * @author rikardwi
 *
 * @param <T> Type of Set
 **/
public class SetBuilder<T> {

    private Set<T> set;
    
    /**
     * Constructor uses the default set implementation (HashSet). 
     **/
    public SetBuilder() {
        this.set = new HashSet<T>();
    }
    
    /**
     * Constructor.
     * 
     * @param set Set to use.
     **/
    public SetBuilder(Set<T> set) {
        this.set = set;
    }
    
    /**
     * Adds an item to the set.
     * 
     * @param item Item to add.
     * 
     * @return This builder
     **/
    public SetBuilder<T> add(T item) {
        set.add(item);
        return this;
    }
    
    /**
     * Adds items to the set.
     * 
     * @param items vargs of items to add.
     * 
     * @return This builder
     **/
    public SetBuilder<T> add(T... items) {
        set.addAll(Arrays.asList(items));
        return this;
    }
    
    /**
     * Adds a collection of items to the set.
     * 
     * @param items Collection of items to add.
     * 
     * @return This builder
     **/
    public SetBuilder<T> addAll(Collection<? extends T> items) {
        set.addAll(items);
        return this;
    }
    
   
    /**
     * Return the set.
     * 
     * @return the set
     **/
    public Set<T> build() {
        return set;
    }
    
}
