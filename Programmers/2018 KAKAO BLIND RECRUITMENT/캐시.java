/* Programmers
 * 2018 KAKAO BLIND RECRUITMENT - [1차] 캐시
 * created on 2021.05.30
 * created by jionchu */

import java.util.HashMap;

class Solution {
    
    private HashMap<String, Node> map;
    private int cacheSize;
    private Node head;
    private Node tail;
    private int answer;
    
    public int solution(int cacheSize, String[] cities) {
        map = new HashMap<>();
        
        //cacheSize가 0인 경우 모든 입력이 cache miss
        if (cacheSize == 0) return cities.length * 5;
        
        this.cacheSize = cacheSize;
        
        //초기화
        head = new Node("");
        tail = new Node("");
        head.next = tail;
        tail.prev = head;
        
        for (String city : cities) {
            put(city.toLowerCase());
        }
        
        return answer;
    }
    
    //doubly linked list
    private class Node {
        private String key;
        private Node prev;
        private Node next;
        
        public Node(String key) {
            this.key = key;
        }
    }
    
    private void put(String key) {
        Node newNode = new Node(key);
        
        //cache hit
        if (map.containsKey(key)) {
            Node oldNode = map.get(key);
            remove(oldNode);
            answer -= 4;
        }
        
        //cache miss
        else if (map.size() >= cacheSize) {
            Node delNode = tail.prev;
            remove(delNode);
        }
        
        insertHead(newNode);
        answer += 5;
    }
    
    //노드 삭제
    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
        
        map.remove(node.key);
    }
    
    //헤드에 노드 삽입
    private void insertHead(Node node) {
        this.head.next.prev = node;
        node.next = this.head.next;
        node.prev = this.head;
        this.head.next = node;
        
        map.put(node.key, node);
    }
}