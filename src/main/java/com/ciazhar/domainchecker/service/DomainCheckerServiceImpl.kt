package com.ciazhar.domainchecker.service

import org.xbill.DNS.*

/**
 * Created by ciazhar on 05/02/18.
 * [ Documentatiion Here ]
 */
class DomainCheckerServiceImpl : DomainCheckerService{

    override fun checkDomain(domain: String, dnsbl : String): Boolean {
        val lookup = Lookup(domain, Type.A)
        val records = lookup.run()

        records.forEach {
            it as ARecord
            val ip = it.address.hostAddress

            val lookup2 = Lookup(ip+"."+dnsbl, Type.TXT)
            val resolver = SimpleResolver()
            lookup2.setResolver(resolver)
            lookup2.setCache(null)

            val result = lookup2.run()

            ///blocked
            if(lookup2.result == Lookup.SUCCESSFUL) {
                result.forEach {
                    return true
                }
            }
            ///not blocked
            else if (lookup2.result == Lookup.HOST_NOT_FOUND){
                return false
            }
        }
        return false

    }

}