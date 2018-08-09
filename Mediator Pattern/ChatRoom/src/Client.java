public class Client {
    public static void main(String[] args){
        ChatRoom room104=new ChatRoom();

        User u1=new Student(room104,"kowshid");
        User u2=new Student(room104,"rouf");
        User u3=new Student(room104,"aditya");
        User u4=new Student(room104,"imran");

        room104.addUser(u1);
        room104.addUser(u2);
        room104.addUser(u3);
        room104.addUser(u4);

        u1.sendMessage("sup nigga!");
    }
}
