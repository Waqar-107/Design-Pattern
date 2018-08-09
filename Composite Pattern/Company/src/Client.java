public class Client {
    public static void main(String[] args){
        Composite md=new Composite("tameem",101,"general manager");
        Composite pm1=new Composite("imran",100,"project manager");
        Composite pm2=new Composite("waqar",107,"project manager");

        Leaf a1=new Leaf("a",1,"developer");
        Leaf a2=new Leaf("b",2,"developer");
        Leaf a3=new Leaf("c",3,"developer");

        Leaf b1=new Leaf("x",1,"developer");
        Leaf b2=new Leaf("y",2,"developer");
        Leaf b3=new Leaf("z",3,"developer");

        pm1.addEmployee(b1);
        pm1.addEmployee(b2);
        pm1.addEmployee(b3);

        pm2.addEmployee(a1);
        pm2.addEmployee(a2);
        pm2.addEmployee(a3);

        md.addEmployee(pm1);
        md.addEmployee(pm2);

        md.showDetails();
    }
}
