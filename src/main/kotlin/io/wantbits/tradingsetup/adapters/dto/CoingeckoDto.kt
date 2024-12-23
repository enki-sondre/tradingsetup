package io.wantbits.tradingsetup.adapters.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.sql.Timestamp

@JsonIgnoreProperties(ignoreUnknown = true)
data class CoingeckoDto (
    val id: String,
    val symbol: String,
    val name: String,
    //@JsonProperty("current_price")
    val current_price: Double,
    val total_volume: Long,
    val circulating_supply: Double,
    val max_supply: Double,
    val last_updated: Timestamp,
    val market_cap: Long
)

