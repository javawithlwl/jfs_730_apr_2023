package com.careerit.cms.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CountryInfo {
    private String name;
    private String region;
    private String flagUrl;
}
