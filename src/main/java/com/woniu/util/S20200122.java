package com.woniu.util;

import java.util.Stack;

public class S20200122 {

}
class MinStack {
    private Stack<Integer> data;
    private Stack<Integer> helper;
    /** initialize your data structure here. */
    public MinStack() {
        data = new Stack<Integer>();
        helper = new Stack<Integer>();
    }

    public void push(int x) {
        data.add(x);
        if(helper.empty()||x<helper.peek()){
            helper.add(x);
        }else {
            helper.add(helper.peek());
        }
    }

    public void pop() {
        data.pop();
        helper.pop();
    }

    public int top() {
        return data.peek();
    }

    public int getMin() {
        return helper.peek();
    }
}