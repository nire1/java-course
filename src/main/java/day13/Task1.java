package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        user1.sendMessage(user2,"Привет!");
        user1.sendMessage(user2,"Как дела?");

        user2.sendMessage(user1,"Привет");
        user2.sendMessage(user1,"Horosho");
        user2.sendMessage(user1,"Kaka tvoi?");

        user3.sendMessage(user1,"Hi");
        user3.sendMessage(user1,"Where are you?");
        user3.sendMessage(user1,"I'm waiting you");

        user1.sendMessage(user3,"Hi");
        user1.sendMessage(user3,"I'm commming");
        user1.sendMessage(user3,"See you");


        user3.sendMessage(user1,"shit");
        MessageDatabase.showDialog(user1,user3);
    }
}
