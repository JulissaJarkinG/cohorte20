/*
 * Copyright 2017 the original author or authors.
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

package org.gradle.util;

import org.gradle.internal.UncheckedException;
import org.gradle.internal.deprecation.DeprecationLogger;
import org.gradle.util.internal.TextUtil;

import java.io.File;

/**
 * This class is only here to maintain binary compatibility with existing plugins.
 *
 * @deprecated Will be removed in Gradle 9.0.
 */
@Deprecated
public class RelativePathUtil {

    private static void logDeprecation() {
        DeprecationLogger.deprecateType(RelativePathUtil.class)
            .willBeRemovedInGradle9()
            .withUpgradeGuideSection(7, "org_gradle_util_reports_deprecations")
            .nagUser();
    }

    public RelativePathUtil() {
        logDeprecation();
    }

    /**
     * Returns a relative path from 'from' to 'to'
     *
     * @param from where to calculate from
     * @param to where to calculate to
     * @return The relative path
     */
    public static String relativePath(File from, File to) {
        logDeprecation();
        try {
            return TextUtil.normaliseFileSeparators(from.toPath().relativize(to.toPath()).toString());
        } catch (Exception e) {
            throw UncheckedException.throwAsUncheckedException(e);
        }
    }
}
