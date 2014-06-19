/*******************************************************************************
 * Copyright 2014 Katja Hahn
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.github.katjahahn.parser;

import com.google.java.contract.Ensures;
import com.google.java.contract.Requires;

/**
 * Represents a header of the pe file or a header of a section.
 * 
 * @author Katja Hahn
 * 
 * @param <T>
 *            Key type for the header
 */
public abstract class Header<T extends HeaderKey> implements PEModule {

    public static final String NL = System.getProperty("line.separator");

    /**
     * Returns the value for the key.
     * 
     * @param key the header key
     * @return long value for the key
     */
    @Requires("key != null")
    public abstract long get(T key);

    /**
     * Returns the {@link StandardField} for the given key.
     * 
     * @param key the header key
     * @return {@link StandardField} for the given key.
     */
    @Ensures("result != null")
    public abstract StandardField getField(T key);
}