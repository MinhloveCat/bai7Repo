public class Calculator {

    public int add(int a, int b) {
        System.out.println("Thuc hien phep cong: " + a + " + " + b);

        int result = a + b;
        System.out.println("Ket qua: " + result);

        return result;
    }

    static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(10, 20);
        calc.add(10,90);
    }
}