package com.discardpast.stack_array;

import com.discardpast.Stack;
import com.discardpast.StackHelp;

public class StackArray implements StackHelp{

    @Override
    public void init_Stack(Stack stack) {
        stack.setArrayStackData(new Object[stack.getLength()]);
        stack.setTop(0);
    }

    @Override
    public boolean isEmpty_Stack(Stack stack) {
        return stack.getCount() == 0;
    }

    @Override
    public boolean isFull_Stack(Stack stack) {
        return stack.getArrayStackData() != null && stack.getArrayStackData().length == stack.getLength();
    }

    @Override
    public void push_Stack(Stack stack, Object value) {
            stack.getArrayStackData()[stack.count++] = value;
    }

    @Override
    public void pop_Stack(Stack stack) {
        Object[] obj = new Object[stack.getArrayStackData().length - 1];
        for (int i = 0;i < stack.getArrayStackData().length - 1;i++)
        {
            obj[i] = stack.getArrayStackData()[i];
        }
        stack.setArrayStackData(obj);
    }

    @Override
    public void print_Stack(Stack stack) {
        for (Object obj:stack.getArrayStackData()) {
            System.out.println(obj);
        }
    }
}
