package com.List;

import javax.xml.transform.Result;
import java.util.ArrayList;
import java.util.List;

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

//    删除链表指定位置的节点数据
    public boolean deleteListNode(String InputNode){
        if (headNode == null){
            return false;
        }
        else {
            ListNode pnode = headNode;
            ListNode hnode = pnode;
            while (pnode.Next != null){
                if (pnode.data.equals(InputNode)){
                    if (pnode == headNode)
                    {
                        headNode = pnode.Next;
                        pnode.Next = null;
                        return true;
                    }else if (pnode.Next != null){
                        pnode = pnode.Next;
                        return true;
                    }
                    else {
                        pnode.Next = null;
                        return true;
                    }
                }else {
                    pnode = pnode.Next;
                }
            }
            if (pnode.data.equals(InputNode)){
                pnode.Next = null;
                return true;
            }else {
                return false;
            }
        }
    }

    // 输出链表的数据
    public List<String> getListArray(){
        // 初始化一个返回结果的数组
        List<String> ResultArray = new ArrayList<String>();
        if (headNode == null) {
            return null;
        }else
        {
            ListNode pnode = headNode;
//            循环链表一直到最后一个节点
            while (pnode.Next !=null)
            {
               ResultArray.add(pnode.data);
               pnode = pnode.Next;
            }
//            最后一个节点输入到数组中去
            ResultArray.add(pnode.data);
            return ResultArray;
        }
    }

//    输出得到链表的长度
    public int getListLength(){
        int length = 0;
        if (headNode == null){
            return length;
        }else {
            ListNode pnode = headNode;
            while (pnode.Next !=null){
                length ++;
                pnode = pnode.Next;
            }
            length++;
            return length;
        }
    }

}
