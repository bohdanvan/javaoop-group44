package com.bvan.oop.lessons11_12.multithreading.shared_resource.chatroom;

/**
 * @author bvanchuhov
 */
public interface ChatRoom {
    void send(String message);
    String getContent();
}
