package collection.list;

public class BatchProcessor {

    private final MyList<Integer> lsit;

    public BatchProcessor(MyList<Integer> lsit) {
        this.lsit = lsit;
    }

    public void logic(int size){
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < size; i++){
            lsit.add(0,i); //앞에 추가
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
}
