package io.wantbits.tradingsetup.controller

import io.wantbits.tradingsetup.adapters.dto.CoingeckoDto
import io.wantbits.tradingsetup.service.CoingeckoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/coingecko")
class CoingeckoController(private val coingeckoService: CoingeckoService) {

    @GetMapping("/prices")
    fun getTokenPrice(@RequestParam tokenId: String): Array<CoingeckoDto>? {
        return coingeckoService.fetchTokenPrice(tokenId)
    }
}
