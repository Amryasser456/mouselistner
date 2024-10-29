import com.sun.opengl.util.FPSAnimator;

import javax.media.opengl.GLCanvas;
import javax.swing.*;
import java.awt.*;

public class KeyTypeApp extends JFrame {

    private GLCanvas glcanvas;
    public static FPSAnimator animator = null;
    private KeyTypeEventListener listener = new KeyTypeEventListener();

    public static void main(String[] args) {
        new KeyTypeApp();
        animator.start();
    }

    public KeyTypeApp() {
        // Set the JFrame title
        super("Task");
        // Kill the process when the JFrame is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        glcanvas = new GLCanvas();
        // Initialize the animator with the GLCanvas and the frame rate
        animator = new FPSAnimator(glcanvas, 60);
        // Add the GLEventListener to the GLCanvas
        glcanvas.addGLEventListener(listener);
        // Add the key listener to the GLCanvas
        glcanvas.addKeyListener(listener);
        // Add the mouse listener to the GLCanvas
        glcanvas.addMouseListener(listener);
        // Add the mouse motion listener to the GLCanvas
        glcanvas.addMouseMotionListener(listener);
        // Add the GLCanvas just like we would any Component
        getContentPane().add(glcanvas, BorderLayout.CENTER);
        // Set the focus to the GLCanvas
        glcanvas.setFocusable(true);
        // Set the size of the JFrame
        setSize(500, 300);
        // Set the location of the JFrame
        setLocationRelativeTo(this);
        // Make the JFrame visible
        setVisible(true);
    }
}
