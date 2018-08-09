public class Student extends User {

    public Student(ChatMediator chatRoom, String userName) {
        super(chatRoom, userName);
    }

    @Override
    public void sendMessage(String msg) {
        System.out.println(this.userName+" sending message: "+msg);
        this.chatRoom.sendMessage(this,msg);
    }

    @Override
    public void receiveMessage(String msg) {
        System.out.println(this.userName+" received message: "+msg);
    }
}
