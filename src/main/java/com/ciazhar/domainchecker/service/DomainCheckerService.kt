package com.ciazhar.domainchecker.service

/**
 * Created by ciazhar on 05/02/18.
 * [ Documentatiion Here ]
 */
interface DomainCheckerService {
    fun checkDomain(domain : String) : Boolean
}