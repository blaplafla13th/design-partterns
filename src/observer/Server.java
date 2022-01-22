package observer;

import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ChatUpdater chatThread = new ChatUpdater();
        User user1 = new User(chatThread);
        user1.getLatestChat();
        User user2 = new User(chatThread);
        user2.getLatestChat();
        chatThread.addChat("Server:Welcome to chat Server");
        System.out.println("User1:");
        user1.getAllChat();
        System.out.println("User2:");
        user2.getAllChat();
        System.out.println("User1 type something to chat:");
        user1.addChat(input.nextLine());
        System.out.println("User2 see chat:");
        user2.getAllChat();
    }
}
