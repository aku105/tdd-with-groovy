package com.calculator
import spock.lang.Specification

/*
 * Tests the calculator class
 */
class AddTest extends Specification {
    def "Add passes with int"() {
        given:
        def calculator = new Add()
        def expectedAddResult = 4

        when:
        def calculatedAddResult = calculator.add(2, 2)

        then:
        expectedAddResult == calculatedAddResult
    }

    def "Add fails when passed not int"() {
        given:
        def calculator = new Add()

        when:
        def calculatedAddResult = calculator.add('2', '2')

        then:
        thrown(MissingMethodException)
    }

    def "Add passes with float"() {
        given:
        def calculator = new Add()
        def expectedAddResult = (float)15.9

        when:
        def calculatedAddResult = calculator.add(9.2, 6.7)

        then:
        expectedAddResult == calculatedAddResult
    }

    def "Add works with negetives"() {
        given:
        def calculator = new Add()
        def expectedAddResult = 3.5

        when:
        def calculatedAddResult = calculator.add(9.7, -6.2)

        then:
        expectedAddResult == calculatedAddResult
    }
}