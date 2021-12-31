package com.easy.SpringBoot_Auth.dto;

import com.easy.SpringBoot_Auth.web.dto.HelloResponseDto;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트(){

        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name,amount);

        //then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);




    }
}
