/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.agilehandy.commons.api.events.database;

import java.util.UUID;

import io.agilehandy.commons.api.events.JobEvent;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Haytham Mohamed
 **/

@Data
@NoArgsConstructor
public class DBTxnResponse {
	private JobEvent response;

	private UUID globalTxnId;

	private UUID jobId;
	private UUID recordId;
}
