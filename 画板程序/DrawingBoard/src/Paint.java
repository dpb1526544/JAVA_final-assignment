import javax.swing.*;
import java.awt.*;

//画板主界面
public class Paint extends JFrame {
    private Shape[] ShArray = new Shape[10000];
    private int x1, y1, x2, y2;

    public void Draw() {
        this.setTitle("DrawingBoardTest");
        this.setSize(1000, 800);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());

        EventListener btl = new EventListener(this, ShArray);

        String[] command = {"直线", "矩形", "圆形", "橡皮"};
        Color[] color = {Color.BLACK, Color.WHITE, Color.BLUE, Color.YELLOW, Color.RED, Color.GREEN, Color.ORANGE, Color.PINK};
        String[] degree = {"粗","中","细"};

        for (int i = 0; i < command.length; ++i) {
            JButton jb = new JButton(command[i]);
            jb.setBorder(BorderFactory.createRaisedBevelBorder());
            jb.setPreferredSize(new Dimension(100, 30));
            this.add(jb);
            jb.addActionListener(btl);
        }

        for (int i = 0; i < color.length; ++i) {
            RoundButton jb = new RoundButton();
            jb.setBackground(color[i]);
            Dimension dm = new Dimension(30, 30);
            jb.setPreferredSize(dm);
            this.add(jb);
            jb.addActionListener(btl);
        }

        for(int i = 0; i < degree.length; ++i){
            RoundButton jb = new RoundButton(degree[i]);
            jb.setBorder(BorderFactory.createRaisedBevelBorder());
            jb.setPreferredSize(new Dimension(50, 30));
            this.add(jb);
            jb.addActionListener(btl);
        }

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        Graphics gr = this.getGraphics();

        btl.setGr(gr);
        this.addMouseListener(btl);
        this.addMouseMotionListener(btl);
    }

    public void paint(Graphics g) {
        super.paint(g);
        for (int i = 0; i < ShArray.length; ++i) {
            Shape p = ShArray[i];
            if (p != null) {
                x1 = p.getX1();
                y1 = p.getY1();
                x2 = p.getX2();
                y2 = p.getY2();

                g.setColor(p.getColor());
                if (p.getName().equals("直线"))
                    g.drawLine(x1, y1, x2, y2);
                else if (p.getName().equals("矩形"))
                    g.drawRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x1 - x2), Math.abs(y1 - y2));
                else if (p.getName().equals("圆形"))
                    g.drawOval(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x1 - x2), Math.abs(y1 - y2));
                else
                    break;
            } else
                break;
        }
    }
}
