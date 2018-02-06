package com.ciazhar.domainchecker

import io.vertx.core.AbstractVerticle

class MainVerticle : AbstractVerticle() {

    override fun start() {

        DomainChecker.check("youngontop.com")

    }
}
