package com.jzfq.rms.third.test.Consumer;

public class Test {


    public static void main(String[] args) {
        Student student1 = new Student("Ashok","Kumar", 9.5);

        student1 = PredicateConsumerDemo.updateStudentFee(student1,
                //Lambda expression for Predicate interface
                student -> student.grade > 8.5,
                //Lambda expression for Consumer inerface
                student -> student.feeDiscount = 30.0);
        student1.printFee(); //The fee after discount: 1400.0

        Student student2 = new Student("Rajat","Verma", 8.0);
        student2 = PredicateConsumerDemo.updateStudentFee(student2,
                //Lambda expression for Predicate interface
                student -> student.grade >= 8,
                //Lambda expression for Consumer inerface
                student -> student.feeDiscount = 20.0);
        student2.printFee();//The fee after discount: 1600.0

    }



}
