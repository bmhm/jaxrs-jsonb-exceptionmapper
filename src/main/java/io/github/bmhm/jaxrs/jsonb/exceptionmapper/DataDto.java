/*
 *  Copyright 2020 github.com/bmhm
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package io.github.bmhm.jaxrs.jsonb.exceptionmapper;

import javax.json.bind.annotation.JsonbCreator;
import javax.json.bind.annotation.JsonbProperty;
import java.util.StringJoiner;

public class DataDto {

    @JsonbProperty("name")
    private final String name;

    @JsonbCreator
    public DataDto(
            @JsonbProperty("name") final String name
    ) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", DataDto.class.getSimpleName() + "[", "]")
                .add("name='" + this.name + "'")
                .toString();
    }
}
