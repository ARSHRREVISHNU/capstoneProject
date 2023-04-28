package newSt.Streams.ParallelStreams;

import java.util.stream.IntStream;

public class ParallelStreams {


    public void parallelStreamsMethod(){

        IntStream intStream = (IntStream.rangeClosed(1,5)).parallel();

        //IntStream intStreamParallel = intStream.parallel(); - Same as above line

        IntStream intStream2 = IntStream.rangeClosed(1,7);

        if(intStream.isParallel()){
            System.out.println("intStream: The stream is running parallely");
        }
        else {
            System.out.println("intStream: The stream is not running parallely");
        }


        if(intStream2.isParallel()){
            System.out.println("intStream2: The stream is running parallely");
        }
        else{
            System.out.println("intStream2: The stream is not running parallely");
        }

        System.out.println("IntStream parallel");
        intStream.forEach(i -> System.out.println(i));

        System.out.println("IntStream 2 not parallel");
        intStream2.forEach(i -> System.out.println(i));



    }


    public static void main(String[] args) {
        ParallelStreams parallelStreams = new ParallelStreams();
        parallelStreams.parallelStreamsMethod();
    }



}
