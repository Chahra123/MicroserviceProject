package com.imen.microfeedback.config;

import com.imen.microfeedback.entities.FeedbackEntity;
import com.imen.microfeedback.entities.ModelsDto.FeedbackDto;
import org.modelmapper.ModelMapper;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {
    @Bean

    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.createTypeMap(FeedbackDto.class, FeedbackEntity.class)
                .addMappings(mapper ->{
                    mapper.map(FeedbackDto::getRating, FeedbackEntity::setRating);
                    mapper.map(FeedbackDto::getComment, FeedbackEntity::setComment);
                    mapper.map(FeedbackDto::getCreateAt, FeedbackEntity::setCreateAt);
                });

        return modelMapper;
    }

}