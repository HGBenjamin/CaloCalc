package com.hgbenjamin.calocalc.service;

import com.hgbenjamin.calocalc.entity.Food;
import com.hgbenjamin.calocalc.repository.FoodRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * This class is responsible for the business logic of the DailyLogs class. 
 * 
 * 
 * @author haivanbenjamin
 */
@Service
public class FoodService 
{
    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository)
    {
        this.foodRepository = foodRepository;
    }

    public List<Food> findAllByName(String query)
    {
        // check database to see if the foods exist
        
        // if it does return that, user may not see their choice and choose to have a wider search (use usda db)
        
        // otherwise check usda db 
        
        // store the results in server db
        
        // return the results to the user
        
        
        
        return foodRepository.findByNameContainingIgnoreCase(query);
    }

    public List<Food> listFoods()
    {
        return foodRepository.findAll();
    }
    
}
