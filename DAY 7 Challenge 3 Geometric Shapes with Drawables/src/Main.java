public class Main {
    public static void main(String[] args) {

        Shape shapes[]=new Shape[4];
        shapes[0]=new Triangle();
        shapes[1]=new Triangle();
        shapes[2]=new Square();
         shapes[3]=new Square();

        for (Shape S: shapes){
            S.dispalyshape();
            S.drawShape();
            System.out.println("------------------");
        }

    }
}