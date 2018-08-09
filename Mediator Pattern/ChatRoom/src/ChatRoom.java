import java.util.ArrayList;

public class ChatRoom implements ChatMediator{

    private ArrayList<User> userList;

    public ChatRoom() {
        this.userList=new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        this.userList.add(user);
    }

    @Override
    public void removeUser(User user) {
        this.userList.remove(user);
    }

    @Override
    public void sendMessage(User user, String msg) {
        for(User u : userList){
            if(u!=user)
                u.receiveMessage(msg);
        }
    }



}
