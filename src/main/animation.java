package animation;
import java.awt.*;

class MyFrame extends Frame implements Runnable
{
    int a,b,ta,tb;
    
    MyFrame()
    {
        a=100;
        b=100;
        ta=tb=1;
        
        Thread t=new Thread(this);
        t.start();
    }
    
    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.fillOval(a,b,50,50);
        
    }
    public void run()
    {
        while(true)
        {
            a+=ta;
            b+=tb;
        
            if(a<0 || a>450)
                ta=ta*-1;
            if(b<20 || b>350)
                tb=tb*-1;
            repaint();
            
            try{Thread.sleep(5);}catch(Exception e){};
        }
    }
}


public class Animation {

    public static void main(String[] args) 
    {
       MyFrame f=new MyFrame();
       f.setSize(500,400);
       f.setVisible(true);
    }
    
}
