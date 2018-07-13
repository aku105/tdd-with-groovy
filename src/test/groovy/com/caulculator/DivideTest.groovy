package com.calculator

import spock.lang.Specification

class DivideTest extends Specification {
    def "Divide works with int"() {
        given:
        def calculator = new Divide()
        def expectedResult = 6

        when:
        def calculatedResult = calculator.divide(30, 5)

        then:
        calculatedResult == expectedResult
    }

    def "Divide fails when passed not int"() {
        given:
        def calculator = new Divide()

        when:
        def calculatedResult = calculator.divide('2', '2')

        then:
        thrown(MissingMethodException)
    }

    def "Divide by zero fails"() {
        given:
        def calculator = new Divide()

        when:
        def calculatedResult = calculator.divide(30, 0)

        then:
        thrown(ArithmeticException)
    }
    def "Divide passes with float"() {
        given:
        def calculator = new Divide()
        def expectedResult = 1.3731343284

        when:
        def calculatedResult = calculator.divide(9.2, 6.7)

        then:
        expectedResult == calculatedResult
    }

    def "Add works with negetives"() {
        given:
        def calculator = new Divide()
        def expectedResult = -1.564516129

        when:
        def calculatedResult = calculator.divide(9.7, -6.2)

        then:
        expectedResult == calculatedResult
    }
}