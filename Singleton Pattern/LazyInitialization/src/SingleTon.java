public class SingleTon {
    private static SingleTon singleTon;

    private SingleTon() {
    }

    public static SingleTon getInstance(){
        if(singleTon==null){
            System.out.println("getting initialized");
            singleTon=new SingleTon();
        }

        return singleTon;
    }
}
