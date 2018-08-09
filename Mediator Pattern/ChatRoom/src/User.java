public abstract class User {
    protected ChatMediator chatRoom;
    protected String userName;

    public User(ChatMediator chatRoom, String userName) {
        this.chatRoom = chatRoom;
        this.userName = userName;
    }

    public abstract void sendMessage(String msg);
    public abstract void receiveMessage(String msg);
}
