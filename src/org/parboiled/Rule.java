/*
 * Copyright (C) 2009 Mathias Doenitz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.parboiled;

/**
 * Describes the return values of parser rule production methods.
 */
public interface Rule {

    /**
     * Attaches a label to this Rule.
     *
     * @param label the label
     * @return this Rule
     */
    Rule label(String label);

    /**
     * Marks this rule as a leaf rule. The parse tree nodes created by this rule will be leaf nodes in the parse tree,
     * i.e. sub rules will not create parse tree nodes.
     * Leaf rules can be parsed significantly faster than ordinary, parse tree node creating rules.
     *
     * @return this Rule
     */
    Rule asLeaf();

}