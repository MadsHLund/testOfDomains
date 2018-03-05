package testofdomains

import grails.testing.mixin.integration.Integration
import grails.util.Holders
import spock.lang.Specification

@Integration
class POCDomainSpec extends Specification {

    void "POC of getGrailsApplication"() {
        List<Class> domainClasses =
                Holders.getGrailsApplication().getArtefacts("Domain")*.clazz

        expect:"fix me"
            domainClasses.size() > 0
    }
}


