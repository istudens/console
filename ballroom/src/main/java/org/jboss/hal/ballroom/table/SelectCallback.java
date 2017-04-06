/*
 * Copyright 2015-2016 Red Hat, Inc, and individual contributors.
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
package org.jboss.hal.ballroom.table;

import jsinterop.annotations.JsFunction;

/**
 * Callback used for all kind of "select" and "deselect" events.
 *
 * @param <T> the row type
 *
 * @see <a href="https://datatables.net/reference/event/select">https://datatables.net/reference/event/select</a>
 * @see <a href="https://datatables.net/reference/event/deselect">https://datatables.net/reference/event/deselect</a>
 */
@JsFunction
@FunctionalInterface
interface SelectCallback<T> {

    void onSelect(Object event, Api<T> api, String type);
}