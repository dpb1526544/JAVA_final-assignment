public class PrintTriangle {
    public static void main(String[] args) throws MyException {
        try {
            int height = Integer.parseInt(args[0]);
            if (height <= 0) {
                new MyException();
            }
            System.out.println("金子塔高度为：" + height);
            for (int i = 0; i <= height; i++) {
                for (int k = i; k < height; k++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print("*");
                }
                System.out.print('\n');
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("请输入金字塔高度参数。");
        } catch (NumberFormatException e) {
            System.out.println("输入的参数须为大于零的整数。");
        }
    }
}

class MyException extends Exception {
    MyException() {
        System.out.println("请输入大于0的整数。");
        System.exit(-1);
    }
}