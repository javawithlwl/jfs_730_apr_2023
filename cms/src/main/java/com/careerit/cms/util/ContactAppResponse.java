package com.careerit.cms.util;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ContactAppResponse {
        private String message;
        private HttpStatus status;
}
