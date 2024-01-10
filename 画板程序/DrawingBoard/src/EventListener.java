import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//按钮事件监听类
public class EventListener implements ActionListener, MouseListener, MouseMotionListener {
    private int x1, y1, x2, y2;
    private String name = "";
    private String degree = "";
    private Color color = Color.BLACK;

    private Graphics gr;
    private JFrame jf;
    private Shape[] ShArray;
    private int index = 0;

    public EventListener(JFrame frame, Shape[] ShArray) {
        this.jf = frame;
        this.ShArray = ShArray;
    }

    public void setGr(Graphics g) {
        this.gr = g;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("")) {
            JButton button = (JButton) e.getSource();
            color = button.getBackground();
        } else {
            if (e.getActionCommand().length() == 1) {
                degree = e.getActionCommand();
            } else {
                name = e.getActionCommand();
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        x1 = e.getX();
        y1 = e.getY();
        gr.setColor(color);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        x2 = e.getX();
        y2 = e.getY();
        Graphics2D g2d = (Graphics2D) gr;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        switch (degree) {
            case "粗":
                g2d.setStroke(new BasicStroke(5));
                break;
            case "中":
                g2d.setStroke(new BasicStroke(3));
                break;
            case "细":
                g2d.setStroke(new BasicStroke(1));
                break;
            default:
                g2d.setStroke(new BasicStroke(3));
                break;
        }

        switch (name) {
            case "直线":
                gr.drawLine(x1, y1, x2, y2);
                Shape shape = new Shape(x1, y1, x2, y2, name, color);
                if (index < 10000)
                    ShArray[index++] = shape;
                break;
            case "矩形":
                gr.drawRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x1 - x2), Math.abs(y1 - y2));
                Shape shape1 = new Shape(x1, y1, x2, y2, name, color);
                if (index < 10000)
                    ShArray[index++] = shape1;
                break;
            case "圆形":
                gr.drawOval(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x1 - x2), Math.abs(y1 - y2));
                Shape shape2 = new Shape(x1, y1, x2, y2, name, color);
                if (index < 10000)
                    ShArray[index++] = shape2;
                break;
            default:
                gr.drawLine(x1, y1, x2, y2);
                Shape shape3 = new Shape(x1, y1, x2, y2, name, color);
                if (index < 10000)
                    ShArray[index++] = shape3;
                break;
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        x2 = e.getX();
        y2 = e.getY();
        if (name.equals("橡皮")) {
            Graphics2D g2d = (Graphics2D) gr;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setStroke(new BasicStroke(20));
            gr.setColor(jf.getBackground());
            gr.drawLine(x1, y1, x2, y2);
            x1 = x2;
            y1 = y2;
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
