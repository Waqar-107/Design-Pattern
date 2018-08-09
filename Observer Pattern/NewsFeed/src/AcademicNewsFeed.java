import java.util.ArrayList;

public class AcademicNewsFeed implements NewsFeed {

    private ArrayList<Observer> users;

    public AcademicNewsFeed() {
        this.users=new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        this.users.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.users.remove(observer);
    }

    @Override
    public void notifyAllSubscribers(String msg) {
        for(Observer observer : users){
            observer.getNotification(msg);
        }
    }
}
