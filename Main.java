public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("Червоний", 5.0);
        shapes[1] = new Rectangle("Синій", 3.0, 4.0);
        shapes[2] = new Triangle("Зелений", 3.0, 4.0, 5.0);

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("Площа: " + shape.calculateArea());
            System.out.println("Периметр: " + shape.calculatePerimeter());
            shape.paint();
            System.out.println();
        }
    }
}