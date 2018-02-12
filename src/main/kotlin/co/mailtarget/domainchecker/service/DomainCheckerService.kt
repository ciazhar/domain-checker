package co.mailtarget.domainchecker.service

/**
 * Created by ciazhar on 05/02/18.
 * [ Documentatiion Here ]
 */
interface DomainCheckerService {
    fun checkDomain(domain : String, dnsbl : String) : Boolean
}