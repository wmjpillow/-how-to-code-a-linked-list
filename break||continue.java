// https://blog.csdn.net/luoweifu/article/details/10756017



//break;  结束本层循环。

public static void breakTest1() {
    System.out.println("begin to circulating.");
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            if (i == 2 && j==3) {
                System.out.println("break is executed!");
                break;
            }
            System.out.print(i + "*" + j + "=" + i * j + "    ");
        }
        System.out.println();
    }
}

//continue; 结束本层的本次循环。
public static void continueTest2() {
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            if (i == 2 && j == 3) {
                continue;
            }
            System.out.print(i + "*" + j + "=" + i * j + "    ");
        }
        System.out.println();
    }
}