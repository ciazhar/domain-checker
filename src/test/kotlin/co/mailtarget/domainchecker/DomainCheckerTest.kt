package co.mailtarget.domainchecker

import org.junit.Assert
import org.junit.Test
import rx.Observable

/**
 * Created by ciazhar on 13/02/18.
 * [ Documentatiion Here ]
 */
class DomainCheckerTest {

    private val domainYouWantToCheck = "youngontop.com"

    private fun checkDomainReturnList(domain : String): MutableList<String> {
        return DomainChecker.check(domain)
    }

    @Test
    fun checkDomainReturnListMustNotNullTest() {
        val listResult = checkDomainReturnList(domainYouWantToCheck)
        Assert.assertNotNull(listResult)
    }

    @Test
    fun printCheckDomainReturnListTest(){
        val listResult = checkDomainReturnList(domainYouWantToCheck)
        println(listResult)
    }

    private fun checkDomainReturnObservable(domain : String): Observable<MutableList<String>> {
        return DomainChecker.subscribe(domain)
    }

    @Test
    fun checkDomainReturnObservableMustNotNullTest() {
        val observableResult = checkDomainReturnObservable(domainYouWantToCheck)
        Assert.assertNotNull(observableResult)
    }

    @Test
    fun printCheckDomainReturnObservableTest(){
        val observableResult = checkDomainReturnObservable(domainYouWantToCheck)
//        val listResult = mutableListOf<String>()
        observableResult.subscribe()
//        println(listResult)
    }

}