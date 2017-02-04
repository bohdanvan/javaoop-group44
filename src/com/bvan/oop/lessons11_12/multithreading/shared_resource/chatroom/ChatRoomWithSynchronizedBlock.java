package com.bvan.oop.lessons11_12.multithreading.shared_resource.chatroom;

import com.bvan.oop.lessons11_12.multithreading.annotations.ThreadSafe;

/**
 * @author bvanchuhov
 */
@ThreadSafe
public class ChatRoomWithSynchronizedBlock implements ChatRoom {

    private final StringBuilder room = new StringBuilder(); // unsafe resource

    @Override
    public void send(String message) {
        synchronized (room) {
            room.append(message + "\n"); // ok
        }
    }

    @Override
    public String getContent() {
        synchronized (room) {
            return room.toString(); // ok
        }
    }
}
