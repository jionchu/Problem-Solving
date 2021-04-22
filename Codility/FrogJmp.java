/* Codility
 * Lesson 3 - FrogJmp
 * created on 2021.04.22
 * created by jionchu */

class Solution {
    public int solution(int X, int Y, int D) {
        if (X == Y) return 0; //no jump needed
        else return (Y-X-1)/D+1;
    }
}