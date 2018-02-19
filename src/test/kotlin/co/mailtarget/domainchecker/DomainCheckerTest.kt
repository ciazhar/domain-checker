package co.mailtarget.domainchecker

import org.junit.Test

/**
 * Created by ciazhar on 13/02/18.
 * [ Documentatiion Here ]
 */
class DomainCheckerTest {

    private val domainYouWantToCheck = "bitcoin.co.id"

    private fun checkDomainReturnList(domain: String): MutableList<String> {
        return DomainChecker.check(domain)
    }

    @Test
    fun printCheckDomainReturnListTest() {
        println("Running printCheckDomainReturnListTest ...")
        val listResult = checkDomainReturnList(domainYouWantToCheck)
        println(listResult)
        assert(listResult.isNotEmpty())
    }
}