package com.List;

public class ListMain {
    public static void main(String[] args) {
        System.out.print("helloworld");
        WHList list = new WHList();
        list.insertList("赵云");
        list.insertList("李白");
        System.out.print(list.getListArray()+"\n");
        System.out.print("helloworld3");
        System.out.print("helloworld4");
    }
}
