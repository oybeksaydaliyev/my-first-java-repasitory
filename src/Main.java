public class Main {
    public static void main(String[] args) {
        TaskWithVolatileKeyword taskWithVolatileKeyword = new TaskWithVolatileKeyword();

        Thread th1 = new Thread(()->{
            while (!taskWithVolatileKeyword.isFlag()){
                taskWithVolatileKeyword.setFlag(true);
            }
        }
        );

        Thread th2 = new Thread(()->{
            while (!taskWithVolatileKeyword.isFlag()){
                taskWithVolatileKeyword.setFlag(true);
            }
        }
        );
        th1.start();
        th2.start();
    }
}

class TaskWithVolatileKeyword{
    private volatile boolean flag;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}