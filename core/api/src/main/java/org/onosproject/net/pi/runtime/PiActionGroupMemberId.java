/*
 * Copyright 2017-present Open Networking Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.onosproject.net.pi.runtime;

import com.google.common.annotations.Beta;
import org.onlab.util.Identifier;

/**
 * Identifier of a member of an action group in a protocol-independent pipeline, unique withing the scope on an action
 * profile.
 */
@Beta
public final class PiActionGroupMemberId extends Identifier<Integer> implements PiTableAction {

    private PiActionGroupMemberId(int id) {
        super(id);
    }

    /**
     * Returns an action group identifier for the given integer value.
     *
     * @param id identifier
     * @return action group
     */
    public static PiActionGroupMemberId of(int id) {
        return new PiActionGroupMemberId(id);
    }

    /*
    In P4Runtime, group members can be referenced directly as table actions.
    In future we should consider having a more appropriate wrapper class for group member IDs, instead of implementing
    the PiTableAction interface.
     */
    @Override
    public Type type() {
        return Type.GROUP_MEMBER_ID;
    }
}
