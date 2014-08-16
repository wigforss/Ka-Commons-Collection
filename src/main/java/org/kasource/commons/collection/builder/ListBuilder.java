package org.kasource.commons.collection.builder;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * List Builder. Allows populating a list with method chaining.
 * 
 * {@code
 * List<String> list = new ListBuilder<String>().add("A","B","C").add("D").adAll(otherList).build();
 * }
 * 
 * @author rikardwi
 *
 * @param <T> Type of items in the list
 */
public class ListBuilder<T> {

    private List<T> list;
    
    /**
     * Constructor. Uses the default List implementation (LinkedList).
     **/
    public ListBuilder() {
        list = new LinkedList<T>();
    }
    
    /**
     * Constructor.
     * 
     * @param list List to use.
     **/
    public ListBuilder(List<T> list) {
        this.list = list;
    }
    
    /**
     * Adds an item to the list.
     * 
     * @param item Item to add.
     * 
     * @return This builder
     */
    public ListBuilder<T> add(T item) {
        list.add(item);
        return this;
    }
    
    /**
     * Adds items to the list.
     * 
     * @param items Items to add.
     * 
     * @return This builder
     */
    public ListBuilder<T> add(T... items) {
        list.addAll(Arrays.asList(items));
        return this;
    }
    
    
    /**
     * Adds all items in the items Collection to the list.
     * 
     * @param items Items to add.
     * 
     * @return This builder
     **/
    public ListBuilder<T> addAll(Collection<? extends T> items) {
        list.addAll(items);
        return this;
    }
    
    /**
     * Adds all items in the items Collection to the list.
     * 
     * @param index Index to insert items at in the list.
     * @param items Items to add.
     * 
     * @return This builder
     **/
    public ListBuilder<T> addAll(int index, Collection<? extends T> items) {
        list.addAll(index, items);
        return this;
    }
    
    /**
     * Returns the populated List.
     * 
     * @return the populated List.
     **/
    public List<T> build() {
        return list;
    }
}
