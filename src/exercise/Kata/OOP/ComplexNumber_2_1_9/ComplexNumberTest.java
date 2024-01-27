package exercise.Kata.OOP.ComplexNumber_2_1_9;

import java.util.Objects;

public class ComplexNumberTest {

    public static void main(String[] args) {



    }



    public static class ComplexNumber {

        private double re;

        private double im;

        public ComplexNumber() {

        }

        public ComplexNumber(double re, double im) {

            this.re = re;

            this.im = im;

        }

        public double getRe() {

            return re;

        }

        public double getIm() {

            return im;

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ComplexNumber that = (ComplexNumber) o;
            return Double.compare(re, that.re) == 0 && Double.compare(im, that.im) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(re, im);
        }
    }

}
