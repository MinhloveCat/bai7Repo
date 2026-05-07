package calculator;

/**
 * Simple calculator class.
 */
public final class Calculator {

  /** First integer. */
  private static final int THE_FIRST_INTEGER = 10;

  /** Second integer. */
  private static final int THE_SECOND_INTEGER = 20;

  /**
   * Adds two integers.
   *
   * @param a first integer
   * @param b second integer
   * @return result
   */
  public int add(final int a, final int b) {
    System.out.println("Thuc hien phep cong: " + a + " + " + b);

    final int result = a + b;

    System.out.println("Ket qua: " + result);

    return result;
  }

  /**
   * Main method.
   *
   * @param args command-line arguments
   */
  public static void main(final String[] args) {

    final Calculator calc = new Calculator();

    calc.add(THE_FIRST_INTEGER, THE_SECOND_INTEGER);
  }
}

