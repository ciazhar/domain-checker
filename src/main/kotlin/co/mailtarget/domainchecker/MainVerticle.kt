package co.mailtarget.domainchecker

import io.vertx.core.AbstractVerticle

class MainVerticle : AbstractVerticle() {

    override fun start() {

        val domainUWantToCheck = "youngontop.com"
        println("$domainUWantToCheck is blocked by : "+ DomainChecker.check(domainUWantToCheck))

    }
}
