public interface NewsFeed {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyAllSubscribers(String msg);
}
