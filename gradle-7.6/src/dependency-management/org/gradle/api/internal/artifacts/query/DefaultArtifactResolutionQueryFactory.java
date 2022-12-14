/*
 * Copyright 2014 the original author or authors.
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
package org.gradle.api.internal.artifacts.query;

import org.gradle.api.artifacts.query.ArtifactResolutionQuery;
import org.gradle.api.internal.artifacts.GlobalDependencyResolutionRules;
import org.gradle.api.internal.artifacts.RepositoriesSupplier;
import org.gradle.api.internal.artifacts.configurations.ConfigurationContainerInternal;
import org.gradle.api.internal.artifacts.ivyservice.ivyresolve.ResolveIvyFactory;
import org.gradle.api.internal.artifacts.type.ArtifactTypeRegistry;
import org.gradle.api.internal.attributes.ImmutableAttributesFactory;
import org.gradle.api.internal.component.ComponentTypeRegistry;
import org.gradle.internal.resolve.caching.ComponentMetadataSupplierRuleExecutor;

public class DefaultArtifactResolutionQueryFactory implements ArtifactResolutionQueryFactory {
    private final ConfigurationContainerInternal configurationContainer;
    private final RepositoriesSupplier repositoriesSupplier;
    private final ResolveIvyFactory ivyFactory;
    private final GlobalDependencyResolutionRules metadataHandler;
    private final ComponentTypeRegistry componentTypeRegistry;
    private final ImmutableAttributesFactory attributesFactory;
    private final ArtifactTypeRegistry artifactTypeRegistry;
    private final ComponentMetadataSupplierRuleExecutor componentMetadataSupplierRuleExecutor;

    public DefaultArtifactResolutionQueryFactory(ConfigurationContainerInternal configurationContainer,
                                                 RepositoriesSupplier repositoriesSupplier,
                                                 ResolveIvyFactory ivyFactory,
                                                 GlobalDependencyResolutionRules metadataHandler,
                                                 ComponentTypeRegistry componentTypeRegistry,
                                                 ImmutableAttributesFactory attributesFactory,
                                                 ArtifactTypeRegistry artifactTypeRegistry,
                                                 ComponentMetadataSupplierRuleExecutor componentMetadataSupplierRuleExecutor) {
        this.configurationContainer = configurationContainer;
        this.repositoriesSupplier = repositoriesSupplier;
        this.ivyFactory = ivyFactory;
        this.metadataHandler = metadataHandler;
        this.componentTypeRegistry = componentTypeRegistry;
        this.attributesFactory = attributesFactory;
        this.artifactTypeRegistry = artifactTypeRegistry;
        this.componentMetadataSupplierRuleExecutor = componentMetadataSupplierRuleExecutor;
    }

    @Override
    public ArtifactResolutionQuery createArtifactResolutionQuery() {
        return new DefaultArtifactResolutionQuery(configurationContainer, repositoriesSupplier, ivyFactory, metadataHandler, componentTypeRegistry, attributesFactory, artifactTypeRegistry, componentMetadataSupplierRuleExecutor);
    }
}
