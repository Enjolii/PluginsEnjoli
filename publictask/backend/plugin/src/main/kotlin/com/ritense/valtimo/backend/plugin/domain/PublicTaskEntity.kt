package com.ritense.valtimo.backend.plugin.domain

/*
 * Copyright 2015-2024 Ritense BV, the Netherlands.
 *
 * Licensed under EUPL, Version 1.2 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://joinup.ec.europa.eu/collection/eupl/eupl-text-eupl-12
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table
import java.util.UUID


@Entity
@Table(name = "public_task_plugin_entity")
class PublicTaskEntity(

    @Id
    @Column(name = "public_task_id")
    val publicTaskId: UUID,

    @Column(name = "user_task_id")
    val userTaskId: UUID,

    @Column(name = "assignee_candidate_contact_data")
    val assigneeCandidateContactData: String,

    @Column(name = "ttl")
    val timeToLive: Int,

    @Column(name = "is_completed_by_public_task")
    val isCompletedByPublicTask: Boolean,
)