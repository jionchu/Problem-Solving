/* Programmers
 * 월간 코드 챌린지 시즌2 - 모두 0으로 만들기
 * created on 2021.05.16
 * created by jionchu */

import java.util.ArrayList;

class Solution {
    long answer = 0;
    
    public long solution(int[] a, int[][] edges) {
        
        long sum = 0;
        ArrayList<Node> nodes = new ArrayList<>();
        
        //Node들 객체 생성
        for (int i=0;i<a.length;i++) {
            nodes.add(new Node(i,a[i]));
            sum+=a[i];
        }
        
        //모든 점들의 가중치를 0으로 만드는 것이 불가능한 경우
        if (sum != 0) return -1;
        
        //Node마다 연결된 Node 저장
        for (int i=0;i<edges.length;i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            nodes.get(u).addNode(nodes.get(v));
            nodes.get(v).addNode(nodes.get(u));
        }
        
        nodes.get(0).addWeight(nodes.get(0));
        
        return answer;
    }
    
    class Node {
        int index;
        long weight;
        //연결된 노드들 저장
        ArrayList<Node> connected = new ArrayList<>();
        
        Node(int index, int weight) {
            this.index = index;
            this.weight = weight;
        }
        
        public void addNode(Node node) {
            connected.add(node);
        }
        
        public void addWeight(Node node) {
            
            for (int i=0;i<connected.size();i++) {
                //왔던 길로 되돌아가지 않기
                if (connected.get(i) != node) {
                    connected.get(i).addWeight(this);
                }
            }
            
            if (weight > 0) {
                answer += weight;
            } else {
                answer -= weight;
            }
            node.weight += this.weight;
        }
    }
}