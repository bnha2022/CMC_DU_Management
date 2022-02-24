package cmc.du21.cms.http;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthTokenResponse {
    private String accessToken;
    private String refreshToken;
}
