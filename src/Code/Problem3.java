package Code;

import java.util.ArrayList;

/*
    输入一个链表，从尾到头打印链表每个节点的值。
    思路：用递归实现  或者用堆栈实现
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class Problem3 {
    private ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        process(listNode);
        return list;
    }

    public void process(ListNode listNode) {
        if (listNode != null) {
            if (listNode.next != null) {
                process(listNode.next);
            }
            list.add(listNode.val);
        }

    }
}
