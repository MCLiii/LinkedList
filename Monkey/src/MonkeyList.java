
public class MonkeyList {
    private Node monkeyCir;
    private final Node start;
    private int skipNum;
    public MonkeyList(int num, int skipNum){
        start=monkeyCir=new Node(1,null);
        monkeyCir.setNext(start);
        for(int i=1;i<num;i++){
            monkeyCir.setNext(new Node(i+1,start));
            monkeyCir=monkeyCir.getNext();
        }
        this.skipNum=skipNum;
    }
    public void eliminate(){
        monkeyCir=start;
        while (monkeyCir!=monkeyCir.getNext()){
            int a=0;
            while(a!=skipNum) {
                monkeyCir = monkeyCir.getNext();
                a++;
            }
            System.out.println("delete"+monkeyCir.getNext().getName());
            monkeyCir.setNext(monkeyCir.getNext().getNext());
        }
    }
    public void display(){
        System.out.println("King is "+monkeyCir.getName());
    }
}