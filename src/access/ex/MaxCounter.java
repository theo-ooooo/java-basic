package access.ex;

public class MaxCounter {
    private int count = 0;
    private final int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if(isMaxCountOver()) {
            System.out.println("최대값을 초과할 수 없습니다.");
        } else {
            count++;
        }
    }

    public int getCount() {
        return count;
    }

    private boolean isMaxCountOver() {
       return count >= max;
    }
}
