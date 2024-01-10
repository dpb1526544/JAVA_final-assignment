import java.awt.*;

//主程序入口
public class DrawingBoardTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Paint paint = new Paint();
                paint.Draw();
            }
        });
    }
}

