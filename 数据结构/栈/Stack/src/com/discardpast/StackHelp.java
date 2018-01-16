package com.discardpast;

public interface StackHelp{
    //初始化栈
    void init_Stack(Stack stack);
    //判断栈是否为空
    boolean isEmpty_Stack(Stack stack);
    //判断栈是否为满
    boolean isFull_Stack(Stack stack);
    //压栈操作
    void push_Stack(Stack stack,Object value);
    //出栈操作
    void pop_Stack(Stack stack);
    //打印栈
    void print_Stack(Stack stack);
}