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
    fun printCheckDomainReturnListTest(){
        println("Running printCheckDomainReturnListTest ...")
        val listResult = checkDomainReturnList(domainYouWantToCheck)
        println(listResult)
    }

    private fun checkDomainReturnObservable(domain : String): Observable<MutableList<String>> {
        return DomainChecker.subscribe(domain)
    }

    @Test
    fun printCheckDomainReturnObservableTest(){
        println("Running printCheckDomainReturnObservableTest ...")
        val observableResult = checkDomainReturnObservable(domainYouWantToCheck)
        observableResult.subscribe()
        observableResult.forEach {
            it.forEach {
                println("$domainYouWantToCheck is blocked by $it")
            }
        }
    }

}