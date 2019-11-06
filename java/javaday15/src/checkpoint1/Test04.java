package checkpoint1;

public class Test04 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    System.out.println("显示播放背景音乐");
                }

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    System.out.println("显示画面");
                }

            }
        }).start();
    }

}
