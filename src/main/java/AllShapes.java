
import java.awt.Color;
import static java.awt.Color.*;
import static java.awt.Color.red;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.lang.reflect.Field;


public class AllShapes {
    
    private static Color CCOLOR = null;
    int x[]={25,0,50};
    int y[]={0,60,60};
    
    int xb[]={35,0,60};
    int yb[]={1,60,60};
    
    public Color getCColor() {
        return CCOLOR;
    }
    
    public void setCColor(Color CCOLOR) {
        this.CCOLOR = CCOLOR;
    }
    
    
    // Tworzenie koła
    
        public static BufferedImage getCircle() {
        
	BufferedImage circleImage = new BufferedImage(60, 60, BufferedImage.TYPE_INT_ARGB);

	Graphics2D g = (Graphics2D) circleImage.getGraphics();
	g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	g.setColor(CCOLOR);
	g.fillOval(5, 5, 50, 50);
	g.drawOval(5, 5, 50, 50);
        g.dispose();
	return circleImage;
	    
    }
        
        public static BufferedImage getCircleB() {
        
	BufferedImage circleBImage = new BufferedImage(70, 70, BufferedImage.TYPE_INT_ARGB);

	Graphics2D g = (Graphics2D) circleBImage.getGraphics();
	g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	g.setColor(CCOLOR);
	g.drawOval(5, 5, 60, 60);
        g.dispose();
	return circleBImage;
	//XD
    }
    
    // Tworzenie kwadratu
        
    public static BufferedImage getSquare() {

	BufferedImage squareImage = new BufferedImage(60, 60, BufferedImage.TYPE_INT_ARGB);

	Graphics2D g = (Graphics2D) squareImage.getGraphics();
	g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	g.setColor(CCOLOR);
	g.fill(new Rectangle(5, 5, 50, 50));
	g.draw(new Rectangle(5, 5, 50, 50));
        g.dispose();
	return squareImage;
	    
    }
    
    public static BufferedImage getSquareB() {

	BufferedImage squareImage = new BufferedImage(70, 70, BufferedImage.TYPE_INT_ARGB);

	Graphics2D g = (Graphics2D) squareImage.getGraphics();
	g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	g.setColor(CCOLOR);
	g.draw(new Rectangle(5, 5, 60, 60));
        g.dispose();
	return squareImage;
	    
    }

    // Tworzenie kwadratu
        
    public BufferedImage getRectangle() {
        

	BufferedImage triangleImage = new BufferedImage(60, 60, BufferedImage.TYPE_INT_ARGB);

	Graphics2D g = (Graphics2D) triangleImage.getGraphics();
	g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	g.setColor(CCOLOR);
	g.fill(new Rectangle(0, 5, 70, 50));
	g.draw(new Rectangle(0, 5, 70, 50));
        g.dispose();
	return triangleImage;
	    
    }
    
    public BufferedImage getRectangleB() {
        

	BufferedImage triangleImage = new BufferedImage(80, 80, BufferedImage.TYPE_INT_ARGB);

	Graphics2D g = (Graphics2D) triangleImage.getGraphics();
	g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	g.setColor(CCOLOR);
	g.draw(new Rectangle(0, 5, 70, 60));
        g.dispose();
	return triangleImage;
	    
    }
    
    // Tworzenie trójkąta
    
    public BufferedImage getTriangle() {
        

	BufferedImage triangleImage = new BufferedImage(80, 80, BufferedImage.TYPE_INT_ARGB);

	Graphics2D g = (Graphics2D) triangleImage.getGraphics();
	g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	g.setColor(CCOLOR);
	g.fillPolygon(x,y,3);
	g.drawPolygon(x,y, 3);
        g.dispose();
	return triangleImage;
	    
    }
    
    public BufferedImage getTriangleB() {
        

	BufferedImage triangleImage = new BufferedImage(60, 60, BufferedImage.TYPE_INT_ARGB);

	Graphics2D g = (Graphics2D) triangleImage.getGraphics();
	g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	g.setColor(CCOLOR);
	g.drawPolygon(xb,yb, 3);
        g.dispose();
	return triangleImage;
	    
    }
    
    // Zamiana String na Color
    
    public static Color stringToColor(final String value) {
    if (value == null) {
      return Color.black;
    }
    try {
      return Color.decode(value);
    } catch (NumberFormatException nfe) {
      try {
        final Field f = Color.class.getField(value);

        return (Color) f.get(null);
      } catch (Exception ce) {
        return Color.black;
      }
    }
  }

}
