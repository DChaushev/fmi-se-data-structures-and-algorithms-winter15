package com.fmi.se.dsa.main;

import com.fmi.se.dsa.implementations.LinkedListQueue;
import com.fmi.se.dsa.implementations.LinkedListStack;
import com.fmi.se.dsa.interfaces.Queue;
import com.fmi.se.dsa.interfaces.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dimitar
 */
public class Main {

    public static void main(String[] args) {
        Stack<Integer> intStack = new LinkedListStack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        intStack.push(4);

        intStack.pop();

        intStack.push(5);

        while (!intStack.isEmpty()) {
            System.out.println(intStack.pop());
        }

        System.out.println("------------");

        Queue<Integer> intQueue = new LinkedListQueue<>();
        intQueue.push(1);
        System.out.println(intQueue.pop());
        intQueue.push(2);
        intQueue.push(3);
        System.out.println(intQueue.pop());
        intQueue.push(4);

        while (!intQueue.isEmpty()) {
            System.out.println(intQueue.pop());
        }
        System.out.println(intQueue.pop());
        System.out.println(intQueue.isEmpty());
    }
}
