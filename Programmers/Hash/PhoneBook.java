/* Programmers
 * 해시 - 전화번호 목록
 * created on 2020.12.29
 * created by jionchu */

class Solution {
    public boolean solution(String[] phone_book) {
        for (int i=0;i<phone_book.length;i++) {
            for (int j=i+1;j<phone_book.length;j++) {
                //한 번호가 다른 번호의 접두사인지 확인한다.
                if(phone_book[i].startsWith(phone_book[j]) || phone_book[j].startsWith(phone_book[i]))
                    return false;
            }
        }
        return true;
    }
}