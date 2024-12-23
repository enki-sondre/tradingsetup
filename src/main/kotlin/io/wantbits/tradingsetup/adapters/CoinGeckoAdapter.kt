package io.wantbits.tradingsetup.adapters

import io.wantbits.tradingsetup.adapters.dto.CoingeckoDto
import org.springframework.stereotype.Component
import org.springframework.web.client.RestClient
import org.springframework.web.client.RestClientResponseException

@Component
class CoingeckoAdapter(private val restClient: RestClient) {

    fun fetchPrices(tokenId: String): Array<CoingeckoDto>? {
        return try {
            restClient.get()
                .uri { uriBuilder ->
                    uriBuilder.path("/coins/markets")
                        .queryParam("vs_currency", "usd")
                        .queryParam("ids", tokenId)
                        .build()
                }
                .retrieve()
                .body(Array<CoingeckoDto>::class.java)
        } catch (e: RestClientResponseException) {
            throw RuntimeException("Failed to fetch prices from CoinGecko: ${e.message}", e)
        }
    }
}

