package com.hdu.neurostudent_paradigm.config;

import com.hdu.neurostudent_paradigm.entity.ParadigmTouchScreen;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("paradigm")
@Data
public class ParadigmConfig {
    public static ParadigmTouchScreen PARADIGM = null;

}
