import grails.plugin.spock.IntegrationSpec
import Person

class PersonPersistenceSpec extends IntegrationSpec {
    def "can be persisted"() {
        expect:
        new Person(firstName: 'Jaroslav', lastName: 'Hašek', enabled: true).save()
    }
}
