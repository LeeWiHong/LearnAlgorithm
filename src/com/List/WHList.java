package com.List;

import java.lang.reflect.Array;

public class WHList {

    // 链表中的头结点
    ListNode headNode = null;

    // 节点数据结构
    class ListNode{
        // 结点数据
        public String data;
        // 下一个结点的指针
        public ListNode Next;

        // 节点数据初始化
        public ListNode(String data) {
            this.data = data;
        }
    }

    // 链表插入数据
    public void insertList(String data){
        ListNode listNode = new ListNode(data);
        //  头节点为空,也可以说是整个链表都是空的
        if (headNode == null) {
            headNode = listNode;
            headNode.Next = null;
        } else {
            //  链表有数据
            ListNode pNode = headNode;
            //  当链表的next不为null表示一直循环没有到末尾
            while(pNode.Next!=null){
                //  当前节点的next不为空那么pNode就需要往后移动
                pNode = pNode.Next;
            }
            //  循环到有next为null的节点
            // 先将尾节点的next赋值为当前新增的这个节点
            pNode.Next = listNode;
            //  在把pNode节点移动到最后
            pNode= listNode;
            // 对最后一个节点的next值赋值为null
            pNode.Next = null;
        }
    }

    // 输出链表的数据
    public Array getListArray(){
        // 初始化一个返回结果的数组
        String[] ResultArray;
        if (headNode == null) {
            return null;
        }else
        {
            return null;
        }

    }

}
