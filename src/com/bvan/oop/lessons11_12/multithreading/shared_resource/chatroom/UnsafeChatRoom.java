package com.bvan.oop.lessons11_12.multithreading.shared_resource.chatroom;

import com.bvan.oop.lessons11_12.multithreading.annotations.NotThreadSafe;

/**
 * @author bvanchuhov
 */
@NotThreadSafe
public class UnsafeChatRoom implements ChatRoom {

    private final StringBuilder room = new StringBuilder(); // unsafe resource

    @Override
    public void send(String message) {
        room.append(message + "\n"); // problem
    }

    @Override
    public String getContent() {
        return room.toString(); // problem
    }
}
