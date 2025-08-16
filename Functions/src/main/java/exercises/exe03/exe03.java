package main.java.exercises.exe03;

public class exe03 {
    public static void main(String[] args) {
        float radius = 5.0f;
        System.out.println("Área do círculo onde o raio é "+ radius +"cm: " + areaCircle(5));
    }
    public static float areaCircle(float r) {
        return (float) (Math.PI * Math.pow(r, 2));
    }
}
