import javax.swing.*;
import java.awt.*;

public class  Extra extends JFrame {

    public SimpleDrawing() {
        setTitle("Simple Drawing Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        add(new MyCanvas());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SimpleDrawing simpleDrawing = new SimpleDrawing();
            simpleDrawing.setVisible(true);
        });
    }
}

class MyCanvas extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE); // Set the drawing color to blue
        g.fillRect(50, 50, 200, 100); // Draw a blue rectangle at (50, 50) with width 200 and height 100
    }
}

