import org.lwjgl.opengl.awt.AWTGLCanvas;
import org.lwjgl.opengl.awt.GLData;

import javax.swing.*;
import java.awt.*;

import static org.lwjgl.opengl.GL20.*;


public class Test {

  public static void main(String[] args) {
    JFrame frame = new JFrame("AWT test");
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.setLayout(new BorderLayout());
    GLData data = new GLData();
    data.samples = 4;
    frame.add(new AWTGLCanvas(data) {
      public void initGL() {
        glClearColor(1, 0, 0, 1);
        glClear(GL_COLOR_BUFFER_BIT);
      }

      public void paintGL() {
        // no op
      }
    });

  }

}
