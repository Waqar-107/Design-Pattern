public class Client {
    public static void main(String[] args){
        AcademicNewsFeed cse15=new AcademicNewsFeed();

        //observers
        Observer o1=new Student("imran",100);
        Observer o2=new Student("tameem",101);
        Observer o3=new Student("kowshid",102);
        Observer o4=new Student("waqar",107);
        Observer o5=new Student("fuad",113);

        cse15.subscribe(o1);
        cse15.subscribe(o2);
        cse15.subscribe(o3);
        cse15.subscribe(o4);
        cse15.subscribe(o5);

        cse15.notifyAllSubscribers("offline submission on assembly language postponed :)");

        cse15.unsubscribe(o5);
        System.out.println();

        cse15.notifyAllSubscribers("offline submission rescheduled 2 days earlier");
    }
}
