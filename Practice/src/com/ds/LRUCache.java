package com.ds;

import java.util.HashMap;
import java.util.Map;
 
public class LRUCache {
     
    private DoublyLinkedList list;
    private Map<Integer, Node> map;
     
    public LRUCache(int cacheSize) {
        list = new DoublyLinkedList(cacheSize);
        map = new HashMap<Integer, Node>();
    }
     
    public void accessPage(int pageNumber) {
        Node pageNode = null;
        if(map.containsKey(pageNumber)) {
            // If page is present in the cache, move the page to the start of list
            pageNode = map.get(pageNumber);
            list.movePageToHead(pageNode);
        } else {
            // If the page is not present in the cache, add the page to the cache
            if(list.getCapacity() == list.getSize()) {
                // If cache is full, we will remove the tail from the cache list
                // Remove it from map too
                map.remove(list.getTail().getPageNumber());
            }
            pageNode = list.addPageToList(pageNumber);
            map.put(pageNumber, pageNode);
        }
    }
     
    public void printCacheState() {
        list.printList();
        System.out.println();
    }
 
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(3);
        cache.accessPage(4);
        cache.printCacheState();
        cache.accessPage(2);
        cache.printCacheState();
        cache.accessPage(1);
        cache.printCacheState();
        cache.accessPage(1);
        cache.printCacheState();
        cache.accessPage(4);
        cache.printCacheState();
        cache.accessPage(3);
        cache.printCacheState();
        cache.accessPage(7);
        cache.printCacheState();
        cache.accessPage(8);
        cache.printCacheState();
        cache.accessPage(3);
        cache.printCacheState();
    }
}