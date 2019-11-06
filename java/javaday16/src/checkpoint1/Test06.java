package checkpoint1;

import checkpoint1.com.hzh.bean.Director;

public class Test06 {
    public static void main(String[] args) {
        invokeDirect(()-> {
                System.out.println("导演拍电影啦！");
            });

        invokeDirect(() -> System.out.println("导演拍电影啦！"));
    }
    private static void invokeDirect(Director director){
        director.makeMovie();
    }
}
