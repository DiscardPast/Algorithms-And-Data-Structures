package com.discardpast;

import com.discardpast.stack_array.StackArray;
import com.discardpast.stack_list.StackList;

import java.util.Scanner;

public class StackTest {
    public static void main(String[] args) {
        StackList stackList = new StackList();

        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);

        stackList.init_Stack(stack);

        System.out.println("要进行多少次压栈操作？");

        int length = scanner.nextInt();

        for (int i = 0;i < length;i++)
        {
            Integer value = scanner.nextInt();
            stackList.push_Stack(stack,value);
        }
        stackList.print_Stack(stack);
        System.out.println(stackList.isEmpty_Stack(stack));
        System.out.println(stackList.isEmpty_Stack(stack));
        stackList.pop_Stack(stack);
        stackList.pop_Stack(stack);
        stackList.pop_Stack(stack);
        stackList.pop_Stack(stack);
        System.out.println(stackList.isEmpty_Stack(stack));
        System.out.println(stackList.isFull_Stack(stack));
        stackList.print_Stack(stack);
        System.out.println("-----------------------------------------------");


        StackArray stackArray = new StackArray();
        Stack stack1 = new Stack();


        System.out.println("要进行多少次压栈操作？");

        int length1 = scanner.nextInt();
        stack1.setLength(length1);
        stackArray.init_Stack(stack1);
System.out.println(stackArray.isEmpty_Stack(stack1));

        for (int i = 0;i < length1;i++)
        {
            Integer value = scanner.nextInt();
            stackArray.push_Stack(stack1,value);
        }
        stackArray.print_Stack(stack1);
        System.out.println(stackArray.isFull_Stack(stack1));
        System.out.println("-----------------------------------------------");
        System.out.println(stackArray.isEmpty_Stack(stack1));
        System.out.println(stackArray.isFull_Stack(stack1));
        stackArray.pop_Stack(stack1);
        stackArray.pop_Stack(stack1);
        System.out.println(stackArray.isEmpty_Stack(stack1));
        System.out.println(stackArray.isFull_Stack(stack1));
        System.out.println("-----------------------------------------------");

        stackArray.print_Stack(stack1);
    }
}
