package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    public void when111to222then1dot73() {
        Point x = new Point(1, 1, 1);
        Point y = new Point(2, 2, 2);
        double result = x.distance3d(y);
        double expected = 1.73;
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void when123to321then2dot82() {
        Point x = new Point(1, 2, 3);
        Point y = new Point(3, 2, 1);
        double result = x.distance3d(y);
        double expected = 2.82;
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }
}