import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        LinkedQueue myQueue = new LinkedQueue();
        myQueue.Enqueue(10);
        myQueue.Enqueue(20);
        myQueue.Enqueue(30);
        myQueue.Enqueue(40);
        myQueue.Enqueue(50);
        myQueue.Enqueue(60);
        myQueue.Enqueue(70);
        myQueue.Enqueue(80);
        myQueue.Enqueue(90);
        myQueue.Enqueue(100);

        int temp,temp2;

            if(myQueue.size()%2==1){
                for(int k=0;k<myQueue.size()/2;k++){
                    myQueue.Enqueue(myQueue.Dequeue());
                }
                int median = (int) myQueue.peek();
                System.out.println("median:"+median);

            }
            else{
                temp=(int)myQueue.peek();
                for(int i=0;i<myQueue.size()-1;i++){
                    myQueue.Enqueue(myQueue.Dequeue());
                }
                temp2=(int)myQueue.peek();
                int median =((temp+temp2)/2);
                //System.out.println(temp+""+temp2);
                System.out.println("median:"+median);
            }


    }
}