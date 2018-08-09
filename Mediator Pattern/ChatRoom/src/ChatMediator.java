public interface ChatMediator {
    void addUser(User user);
    void removeUser(User user);
    void sendMessage(User user,String msg);
}
