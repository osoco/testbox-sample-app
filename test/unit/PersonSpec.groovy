import grails.plugin.spock.UnitSpec
import Person

class PersonSpec extends UnitSpec {
    def "can be instantiated"() {
        given:
        def person = new Person(firstName: 'Jaroslav', lastName: 'Hašek', enabled: true)

        expect:
        person.firstName == 'Jaroslav'
        person.lastName == 'Hašek'
        person.enabled
    }
}
