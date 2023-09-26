
package lab4hometask;


public class Cylinder {
    private double radius;
    private double height;


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
   public Cylinder(){
        radius = 15;
        height= 25;
    }
    public double surfaceArea(){
        return Math.PI*radius*radius*height;
    }
    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder( );
        
        System.out.println(cylinder.getRadius());
       
        System.out.println(cylinder.getHeight());
        System.out.println(cylinder.surfaceArea());
        
        
    }
    
    
    
    
}
