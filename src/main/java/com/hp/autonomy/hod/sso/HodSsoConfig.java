/*
 * Copyright 2015-2018 Micro Focus International plc.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.hod.sso;

import com.hp.autonomy.hod.client.api.authentication.ApiKey;

import java.net.URL;
import java.util.Set;

/**
 * A configuration object which provides the necessary information to authenticate with Micro Focus Haven OnDemand SSO
 */
public interface HodSsoConfig {

    /**
     * @return The application API key to use for authentication
     */
    ApiKey getApiKey();

    /**
     * @return The origins from which the signed request can be sent
     */
    Set<String> getAllowedOrigins();

    /**
     * This is used to determine the allowed origin for the authenticate combined PATCH request.
     * @return The URL of the SSO page, for example https://dev.havenondemand.com/sso.html
     */
    URL getSsoUrl();

}
