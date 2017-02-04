package com.bvan.oop.lessons11_12.multithreading.shared_resource.chatroom;

import com.bvan.oop.lessons11_12.multithreading.annotations.ThreadSafe;

/**
 * @author bvanchuhov
 */
@ThreadSafe
public class SafeChatRoom implements ChatRoom {

    private final StringBuilder room = new StringBuilder(); // unsafe resource

    @Override
    public synchronized void send(String message) {
        room.append(message + "\n"); // ok
    }

    @Override
    public synchronized String getContent() {
        return room.toString(); // ok
    }
}
