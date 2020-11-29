package com.List;

public class ListMain {
    public static void main(String[] args) {
        WHList list = new WHList();
        list.insertList("赵云");
        list.insertList("李白");
        list.insertList("赵云");
        list.insertList("李黄");
        list.insertList("李逵");
        System.out.print(list.getListArray()+"\n");
        System.out.print("list length ="+list.getListLength()+"\n");
        list.deleteListNode("赵云");
        list.deleteListNode("赵云");
        list.deleteListNode("李黄");
        System.out.print(list.getListArray()+"111---\n");
        System.out.print("--222--list length ="+list.getListLength());
    }
}
