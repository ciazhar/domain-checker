package com.ciazhar.domainchecker


import com.ciazhar.domainchecker.service.DomainCheckerServiceImpl

/**
 * Created by ciazhar on 05/02/18.
 * [ Documentatiion Here ]
 */
object DomainChecker {
    private val service by lazy { DomainCheckerServiceImpl() }

    @JvmStatic
    fun check(domain : String) : String{
        return when(service.checkDomain(domain)){
            true -> "$domain is BLOCKED\n"
            false -> "$domain is NOT BLOCKED\n"
        }
    }
}