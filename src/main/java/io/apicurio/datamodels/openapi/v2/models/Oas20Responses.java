/*
 * Copyright 2019 Red Hat
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.apicurio.datamodels.openapi.v2.models;

import io.apicurio.datamodels.openapi.models.OasResponse;
import io.apicurio.datamodels.openapi.models.OasResponses;

/**
 * Implements an OpenAPI 2.0 responses.
 * @author eric.wittmann@gmail.com
 */
public class Oas20Responses extends OasResponses {
    
    /**
     * Constructor.
     */
    public Oas20Responses() {
    }
    
    /**
     * @see io.apicurio.datamodels.openapi.models.OasResponses#createResponse(java.lang.String)
     */
    @Override
    public OasResponse createResponse(String statusCode) {
        OasResponse response = new Oas20Response(statusCode);
        response._ownerDocument = this.ownerDocument();
        response._parent = this;
        return response;
    }

}
