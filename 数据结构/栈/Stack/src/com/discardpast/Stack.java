package com.discardpast;

import java.util.List;

public class Stack {
    /**
     * 链表实现栈
     */
    //List数据存储空间
    private List listStackData;

    /**
     * 数组实现栈
     */
    //Array数据存储空间
    private Object[] arrayStackData;
    //栈容量
    private int length;
    //栈顶
    private int top;
    //计数器
    public int count = 0;

    public List getListStackData() {
        return listStackData;
    }

    public void setListStackData(List listStackData) {
        this.listStackData = listStackData;
    }

    public Object[] getArrayStackData() {
        return arrayStackData;
    }

    public void setArrayStackData(Object[] arrayStackData) {
        this.arrayStackData = arrayStackData;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
