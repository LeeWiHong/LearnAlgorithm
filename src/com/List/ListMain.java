package com.List;

public class ListMain {
    public static void main(String[] args) {
        WHList list = new WHList();
        list.insertList("赵云");
        list.insertList("李白");
        list.insertList(0,"zhaoyun");
//        list.insertList("李黑");
//        list.insertList("李黄");
//        list.insertList("李逵");
        System.out.print(list.getListArray()+"\n");

//        System.out.print("前置节点是---"+list.PriorNode("李白"));
        System.out.print("后置节点是---"+list.NextNode("赵云"));














//        System.out.print("list length ="+list.getListLength()+"\n");
//        list.deleteListNode("赵云");
//        list.deleteListNode("赵云");
//        list.deleteListNode("李黄");
//        System.out.print(list.getListArray()+"111---\n");
//        System.out.print("--222--list length ="+list.getListLength()+"\n");
//        list.insertList("李黄");
//        System.out.print(list.getListArray()+"333---\n");
//        System.out.print("是否存在节点值"+list.LocateNode("黄白"));
//        System.out.print("前置节点是---"+list.PriorNode("李逵"));
    }


}
