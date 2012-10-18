import geb.spock.GebReportingSpec

class PersonCRUDSpec extends GebReportingSpec {
    def "empty person list is displayed"() {
        when:
        to ListPage

        then:
        personRows.size() == 0
    }
}
