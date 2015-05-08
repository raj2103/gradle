/*
 * Copyright 2015 the original author or authors.
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

package org.gradle.tooling.internal.provider.events;

import org.gradle.tooling.internal.protocol.events.InternalBuildOperationFinishedProgressEvent;

public class DefaultBuildOperationFinishedProgressEvent extends AbstractBuildProgressEvent implements InternalBuildOperationFinishedProgressEvent {
    private final AbstractBuildOperationResult result;

    public DefaultBuildOperationFinishedProgressEvent(long eventTime, DefaultBuildDescriptor descriptor, AbstractBuildOperationResult result) {
        super(eventTime, descriptor);
        this.result = result;
    }

    @Override
    public AbstractBuildOperationResult getResult() {
        return result;
    }

    @Override
    public String getDisplayName() {
        return String.format("%s %s", getDescriptor().getDisplayName(), result.getOutcomeDescription());
    }
}
