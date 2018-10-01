package com.ciazhar.domainchecker.service

import rx.Observable

/**
 * Created by ciazhar on 05/02/18.
 * [ Documentatiion Here ]
 */
interface DomainCheckerService {
    fun checkDomain(domain: String, dnsbl: String): Observable<Boolean>
}