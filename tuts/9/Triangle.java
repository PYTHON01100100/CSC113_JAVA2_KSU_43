public class Triangle {
private int side1, side2, side3;
public Triangle(int side1, int side2, int side3) throws
IllegalArgumentException {
if(side1 <= 0 || side2 <= 0 || side3 <= 0)
throw new IllegalArgumentException("Sides cannot be 0 or less!");
this.side1 = side1;
this.side2 = side2;
this.side3 = side3;
}
public boolean isValidTriangle(){
return side1+side2 > side3 && side2+side3 > side1 && side1+side3 > side2;
}
public String getTriType() throws Exception{
if(!isValidTriangle()) throw new Exception("The triangle is not valid!");
if(side1 == side2 && side2 == side3) return "Equilateral";
else if(side1 == side2 || side1 == side3 || side2 == side3)
return "Isosceles";
else return "Scalene";
}
}