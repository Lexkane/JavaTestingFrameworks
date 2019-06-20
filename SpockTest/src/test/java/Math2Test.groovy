import spock.lang.Specification

class Math2Test extends Specification {
    void setup() {
    }

    def test() {
        def list = [1, 2, 3]
        when:
        list.remove(1)
        then:
        list == [1, 3]
    }

    def test2() {
        def mock = Mock(Math2)
        when:
            Provider.get(1, 2, mock)
        then:
            2*mock.add(1,2)
            0*mock.div(_,_)


    }

    def "Add"() {
        setup:
        def obj = new Math2()
        expect:
        obj.add(3, 2) == 5
    }

    def "Add2"() {
        setup:
        def obj = new Math2()
        expect:
        obj.add(a, b) == c
        where:
        a | b | c
        3 | 1 | 4
        2 | 5 | 7
    }

    def "Div"() {
        setup:
        def obj = new Math2()
        def a = 8
        def b = 2
        when:
        def c = obj.div(8, 2)
        then:
        c == 4
    }
}
