package io.wantbits.tradingsetup.service

import io.wantbits.tradingsetup.adapters.CoingeckoAdapter
import io.wantbits.tradingsetup.adapters.dto.CoingeckoDto
import org.springframework.stereotype.Service

@Service
class CoingeckoService(
    val coingeckoAdapter: CoingeckoAdapter
) {
    final fun fetchTokenPrice(tokenId: String): Array<CoingeckoDto>? {
        return coingeckoAdapter.fetchPrices(tokenId)
    }
}