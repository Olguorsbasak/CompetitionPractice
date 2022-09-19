package com.olgu.competitionpractice.mapper;

import com.olgu.competitionpractice.dto.request.RegisterRequestDto;
import com.olgu.competitionpractice.repository.entitiy.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel ="spring",unmappedTargetPolicy= ReportingPolicy.IGNORE)
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);


    User toUser(RegisterRequestDto dto);

    }


