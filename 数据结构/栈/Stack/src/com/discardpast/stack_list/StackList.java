package com.discardpast.stack_list;

import com.discardpast.Stack;
import com.discardpast.StackHelp;

import java.util.ArrayList;

public class StackList implements StackHelp {

    @Override
    public void init_Stack(Stack stack) {
        stack.setListStackData(new ArrayList());
    }

    @Override
    public boolean isEmpty_Stack(Stack stack) {
        return stack.getListStackData().size() == 0;
    }

    @Override
    public boolean isFull_Stack(Stack stack) {
        return stack.getListStackData().size() != 0;
    }

    @Override
    public void push_Stack(Stack stack, Object value) {
        stack.getListStackData().add(value);
    }

    @Override
    public void pop_Stack(Stack stack) {
        stack.getListStackData().remove(stack.getListStackData().size() - 1);
    }

    @Override
    public void print_Stack(Stack stack) {
        for (Object obj:stack.getListStackData()) {
            System.out.println(obj);
        }
    }
}
