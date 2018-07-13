package com.calculator

import spock.lang.Specification

class MultiplyTest extends Specification {
    def "Multiply passes with int"() {
        given:
        def calculator = new Multiply()
        def expectedResult = 6

        when:
        def calculatedResult = calculator.multiply(2, 3)

        then:
        expectedResult == calculatedResult
    }
    def "Multiply fails when passed not int"() {
        given:
        def calculator = new Multiply()

        when:
        def calculatedResult = calculator.multiply('2', '2')

        then:
        thrown(MissingMethodException)
    }

    def "Multiply passes with float"() {
        given:
        def calculator = new Multiply()
        def expectedResult = 61.64

        when:
        def calculatedResult = calculator.multiply(9.2, 6.7)

        then:
        expectedResult == calculatedResult
    }

    def "Add works with negetives"() {
        given:
        def calculator = new Multiply()
        def expectedResult = -60.14

        when:
        def calculatedResult = calculator.multiply(9.7, -6.2)

        then:
        expectedResult == calculatedResult
    }
}