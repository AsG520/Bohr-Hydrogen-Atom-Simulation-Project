import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.ActionEvent;

// Special Thanks to Apply IT: Animation in Java - Rotating Ball around a center using Multithreading and Graphics Programming (https://youtu.be/JjauohnXazU?si=VOQDSWwUlpnx0u8o)

public class HydrogenAtomSimulation extends JPanel {

    // frame properties
    static JFrame frame;
    static int frameWidth = 500;
    static int frameHeight = 500;
    static String frameTitle = "Hydrogen Atom Simulation";
    static boolean frameResizable = false;
    static boolean frameVisible = true;

    // proton properties
    static int protonWidth = 50;
    static int protonHeight = 50;
    static int protonX = 230;
    static int protonY = 190;

    // electron properties
    static int electronWidth = 30;
    static int electronHeight = 30;
    static int electronX = 335;
    static int electronY = 180;

    // shell properties
    static int shellWidth = 200;
    static int shellHeight = 200;
    static int shellX = 153;
    static int shellY = 115;

    // colors properties
    static int colorRed[] = { 255, 0, 0 };
    static int colorBlue[] = { 0, 0, 255 };
    static int colorGrey[] = { 211, 211, 211 };
    static int colorBlack[] = { 0, 0, 0 };

    // extra properties
    static int theta;
    static double oX;
    static double oY;
    static double radius;

    // timer properties
    static Timer timer;
    static int timerDelay = 50;

    public static void main(String args[]) {
        frame = new JFrame(frameTitle);
        frame.setSize(frameWidth, frameHeight);
        frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        HydrogenAtomSimulation panel = new HydrogenAtomSimulation();
        frame.add(panel);
        panel.setBackground(new Color(colorBlack[0], colorBlack[1], colorBlack[2]));
        frame.setResizable(frameResizable);
        frame.setVisible(frameVisible);

        timer = new Timer(timerDelay, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateElectron();
                panel.repaint();
            }
        });
        timer.start();
    }

    private static void updateElectron() {
        theta += 20;

        oX = protonX + protonWidth / 2;
        oY = protonY + protonHeight / 2;
        radius = shellWidth / 2.0;

        electronX = (int) (oX + radius * Math.cos(Math.toRadians(theta)) - electronWidth / 2.0);
        electronY = (int) (oY + radius * Math.sin(Math.toRadians(theta)) - electronHeight / 2.0);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // proton
        g.setColor(new Color(colorRed[0], colorRed[1], colorRed[2]));
        g.fillOval(protonX, protonY, protonWidth, protonHeight);
        g.drawOval(protonX, protonY, protonWidth, protonHeight);

        // electron
        g.setColor(new Color(colorBlue[0], colorBlue[1], colorBlue[2]));
        g.fillOval(electronX, electronY, electronWidth, electronHeight);
        g.drawOval(electronX, electronY, electronWidth, electronHeight);

        // shell
        g.setColor(new Color(colorGrey[0], colorGrey[1], colorGrey[2]));
        g.drawOval(shellX, shellY, shellWidth, shellHeight);
    }
}