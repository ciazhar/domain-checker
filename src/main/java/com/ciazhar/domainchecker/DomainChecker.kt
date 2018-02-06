package com.ciazhar.domainchecker


import com.ciazhar.domainchecker.service.DomainCheckerServiceImpl

/**
 * Created by ciazhar on 05/02/18.
 * [ Documentatiion Here ]
 */
object DomainChecker {
    private val service by lazy { DomainCheckerServiceImpl() }

    @JvmStatic
    fun check(domain : String){

        val dnsblList = listOf(
                "blackholes.five-ten-sg.com",
                "bl.mailspike.net",
                "bl.spamcop.net",
                "bl.emailbasura.org",
                "b.barracudacentral.org",
                "bl.spamcannibal.org",
                "bl.deadbeef.com",
                "bl.spameatingmonkey.net",
                "bl.score.senderscore.com",
                "cdl.anti-spam.org.cn",
                "dnsbl-3.uceprotect.net",
                "dnsbl-1.uceprotect.net",
                "dnsbl.inps.de",
                "combined.rbl.msrbl.net",
                "combined.abuse.ch",
                "dnsbl-2.uceprotect.net",
                "cbl.abuseat.org",
                "db.wpbl.info",
                "bogons.cymru.com",
                "blacklist.woody.ch",
                "dnsbl.sorbs.net",
                "drone.abuse.ch",
                "duinv.aupads.org",
                "dul.dnsbl.sorbs.net",
                "dul.ru",
                "dyna.spamrats.com",
                "dynip.rothen.com",
                "http.dnsbl.sorbs.net",
                "images.rbl.msrbl.net",
                "ips.backscatterer.org",
                "ix.dnsbl.manitu.net,",
                "korea.services.net",
                "misc.dnsbl.sorbs.net",
                "noptr.spamrats.com",
                "ohps.dnsbl.net.au",
                "omrs.dnsbl.net.au",
                "orvedb.aupads.org",
                "osps.dnsbl.net.au",
                "owfs.dnsbl.net.au",
                "pbl.spamhaus.org",
                "owps.dnsbl.net.au",
                "probes.dnsbl.net.au",
                "phishing.rbl.msrbl.net",
                "proxy.block.transip.nl",
                "psbl.surriel.com",
                "proxy.bl.gweep.ca",
                "rdts.dnsbl.net.au",
                "rbl.interserver.net",
                "relays.bl.gweep.ca",
                "relays.nether.net",
                "ricn.dnsbl.net.au",
                "relays.bl.kundenserver.de",
                "residential.block.transip.nl",
                "sbl.spamhaus.org",
                "spam.abuse.ch",
                "rmst.dnsbl.net.au",
                "short.rbl.jp",
                "smtp.dnsbl.sorbs.net",
                "socks.dnsbl.sorbs.net",
                "spam.dnsbl.sorbs.net",
                "spam.rbl.msrbl.net",
                "spam.spamrats.com",
                "spamrbl.imp.ch",
                "tor.dnsbl.sectoor.de",
                "t3direct.dnsbl.net.au",
                "torserver.tor.dnsbl.sectoor.de",
                "ubl.lashback.com",
                "ubl.unsubscore.com",
                "virus.rbl.jp",
                "virbl.bit.nl",
                "xbl.spamhaus.org",
                "zen.spamhaus.org"
        )

        val blockedList = mutableListOf<String>()

        dnsblList.forEach {
            when(service.checkDomain(domain,it)){
                true -> blockedList.add(it)
            }
        }
        return blockedList.forEach {
            print("$domain is blocked by $it\n")
        }

    }
}