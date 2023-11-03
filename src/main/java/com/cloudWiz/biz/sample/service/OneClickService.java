package com.cloudWiz.biz.sample.service;

import com.cloudWiz.biz.sample.dto.OneClickDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import software.amazon.awssdk.auth.credentials.DefaultCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.pricing.PricingClient;
import software.amazon.awssdk.services.pricing.model.GetProductsRequest;
import software.amazon.awssdk.services.pricing.model.GetProductsResponse;

@Service
public class OneClickService {

    private static final Logger LOG = LoggerFactory.getLogger("BIZ_LOGGER");

    public String selectPriceList(OneClickDTO oneClickDTO) {
        // Create pricing client
        PricingClient client = PricingClient.builder()
                .region(Region.US_EAST_1)// or Region.AP_SOUTH_1
                .credentialsProvider(DefaultCredentialsProvider.builder().build())
                .build();

        // 가격 정보 가져오기
        GetProductsResponse response = client.getProducts(GetProductsRequest.builder()
                .serviceCode("AmazonEC2") // 가져올 서비스의 서비스 코드 설정 (예: AmazonEC2, AmazonS3 등)
                .build());

        // 응답 데이터 처리
        for (String product : response.priceList()) {
            LOG.info("Product: {}", product);
        }

        // 클라이언트 종료
        client.close();
        return "";
    }
}
