/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hgbenjamin.calocalc.client.usda;

import org.springframework.stereotype.Component;

@Component
//@RequiredArgsConstructor
public class UsdaClient
{

    //private final RestClient restClient; // or RestTemplate if on older Spring

    //@Value("${usda.api.key}")
    private String apiKey;

    //@Value("${usda.api.base-url}")
    private String baseUrl;

//    public List<Food> search(String query)
//    {
//        UsdaSearchResponse response = restClient.get()
//                .uri(baseUrl + "/foods/search?query={q}&api_key={key}", query, apiKey)
//                .retrieve()
//                .body(UsdaSearchResponse.class);
//
//        if (response == null || response.getFoods() == null)
//        {
//            return Collections.emptyList();
//        }
//
//        return response.getFoods().stream().map(this::mapToFood).toList();
//    }

//    private Food mapToFood(UsdaFoodItem item)
//    {
//        Food food = new Food();
//        food.setFdcId(item.getFdcId());
//        food.setName(item.getDescription());
//        food.setFetchedAt(Instant.now());
//        // map nutrients, etc.
//        return food;
//    }
}
