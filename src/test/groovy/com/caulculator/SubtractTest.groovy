package com.calculator

import spock.lang.Specification

class SubtractTest extends Specification {
    def "Subtract works with int"() {
        given:
        def calculator = new Subtract()
        def expectedResult = 6

        when:
        def calculatedResult = calculator.subtract(10, 4)

        then:
        calculatedResult == expectedResult
    }

    def "Subtract fails when passed not int"() {
        given:
        def calculator = new Subtract()

        when:
        def calculatedResult = calculator.subtract('2', '5')

        then:
        thrown(MissingMethodException)
    }

    def "Subtract passes with float"() {
        given:
        def calculator = new Subtract()
        def expectedResult = 2.5

        when:
        def calculatedResult = calculator.subtract(9.2, 6.7)

        then:
        expectedResult == calculatedResult
    }

    def "Subtract works with negetives"() {
        given:
        def calculator = new Subtract()
        def expectedResult = 15.9

        when:
        def calculatedResult = calculator.subtract(9.7, -6.2)

        then:
        expectedResult == calculatedResult
    }
}