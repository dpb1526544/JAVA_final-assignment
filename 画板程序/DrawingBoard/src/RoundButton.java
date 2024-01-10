import javax.swing.*;
import java.awt.*;

//改变JButton按钮形状为圆形
public class RoundButton extends JButton {

    public RoundButton() {
        setPreferredSize(new Dimension(30, 30));
        setContentAreaFilled(false);
    }

    public RoundButton(String text) {
        super(text);
        setPreferredSize(new Dimension(30, 30));
        setContentAreaFilled(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (getModel().isArmed()) {
            g.setColor(Color.lightGray);
        } else {
            g.setColor(getBackground());
        }
        g.fillOval(0, 0, getSize().width - 1, getSize().height - 1);
        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        g.setColor(getForeground());
        g.drawOval(0, 0, getSize().width - 1, getSize().height - 1);
    }
}