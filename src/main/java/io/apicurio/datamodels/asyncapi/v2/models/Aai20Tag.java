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

package io.apicurio.datamodels.asyncapi.v2.models;

import io.apicurio.datamodels.asyncapi.models.AaiTag;
import io.apicurio.datamodels.core.models.Node;
import io.apicurio.datamodels.core.models.common.Tag;

/**
 * @author eric.wittmann@gmail.com
 * @author Jakub Senko<jsenko@redhat.com>
 */
public class Aai20Tag extends AaiTag {

    /**
     * Constructor.
     */
    public Aai20Tag() {
    }

    /**
     * Constructor.
     */
    public Aai20Tag(String name) {
        super(name);
    }
    
    /**
     * Constructor.
     * @param parent
     */
    public Aai20Tag(Node parent) {
        super(parent);
    }

    /**
     * @see Tag#createExternalDocumentation()
     */
    @Override
    public Aai20ExternalDocumentation createExternalDocumentation() {
        return new Aai20ExternalDocumentation(this);
    }
}
