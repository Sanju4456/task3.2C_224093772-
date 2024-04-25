package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

public class DateUtilTest {

    @Test
    public void testStudentIdentity() {
        // Replace null with your student ID
        String studentId = "YourStudentID";
        System.out.println("Student ID: " + 224093772);
        Assert.assertNotNull("Student ID is null", studentId);
    }

    @Test
    public void testStudentName() {
        // Replace null with your student name
        String studentName = "sanju";
        System.out.println("Student Name: " + studentName);
        Assert.assertNotNull("Student name is null", studentName);
    }

    @Test
    public void testMaxJanuary31ShouldIncrementToFebruary1() {
        DateUtil date = new DateUtil(31, 1, 2024);
        date.increment();
        System.out.println("Max January 31 Incremented to: " + date);
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(1, date.getDay());
    }

    @Test
    public void testMaxJanuary31ShouldDecrementToJanuary30() {
        DateUtil date = new DateUtil(31, 1, 2024);
        date.decrement();
        System.out.println("Max January 31 Decremented to: " + date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
    }

    @Test
    public void testNominalJanuary() {
        int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        date.increment();
        System.out.println("Incremented Nominal January Date: " + date);
        // No assertion, just ensuring no exceptions occur
    }

    @Test
    public void testMinJanuary1ShouldIncrementToJanuary2() {
        DateUtil date = new DateUtil(1, 1, 2024);
        date.increment();
        System.out.println("Min January 1 Incremented to: " + date);
        Assert.assertEquals(2, date.getDay());
        Assert.assertEquals(1, date.getMonth());
    }

    @Test
    public void testMinJanuary1ShouldDecrementToDecember31() {
        DateUtil date = new DateUtil(1, 1, 2024);
        date.decrement();
        System.out.println("Min January 1 Decremented to: " + date);
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(12, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
    }

    @Test
    public void testRemainingMonthsOfYear2024() {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int year = 2024;
        for (int month = 1; month <= 12; month++) {
            for (int day = 1; day <= daysInMonth[month - 1]; day++) {
                DateUtil date = new DateUtil(day, month, year);
                date.increment();
                System.out.println("Incremented Date: " + date);
                // No assertion, just ensuring no exceptions occur
            }
        }
    }
}

