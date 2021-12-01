package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class SampleTest {
    public final static Sample TestSample = new Sample();

    @Test
     void addTest(){
        int resultat = TestSample.op(Sample.Operation.ADD,4,4);
        Assertions.assertThat(resultat).as("sum of 4+4")
            .isEqualTo(8);
    }
    @Test
    void MultTest(){
        int resultat = TestSample.op(Sample.Operation.MULT,4,5);
        Assertions.assertThat(resultat).as("multiplication of 4 and 5")
            .isEqualTo(20);
    }

    @Test
    void FactTest(){
        int resultat = TestSample.fact(5);
        Assertions.assertThat(resultat).as("Factorial of 1")
            .isEqualTo(120);
    }

    @Test
    void FactNegTest(){
        int resultat = -1;
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(()->TestSample.fact(resultat));
    }

}
