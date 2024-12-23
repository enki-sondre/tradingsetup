package io.wantbits.tradingsetup

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestClient

@Configuration
class Configuration {

        @Bean
        fun restClient(): RestClient {
            return RestClient.builder()
                .baseUrl("https://api.coingecko.com/api/v3")
                .build()
        }
    }


