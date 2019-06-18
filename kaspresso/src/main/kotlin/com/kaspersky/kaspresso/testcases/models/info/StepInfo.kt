package com.kaspersky.kaspresso.testcases.models.info

import com.kaspersky.kaspresso.testcases.models.StepStatus

interface StepInfo {
    val description: String
    val testClassName: String
    val level: Int
    val number: String
    val ordinal: Int
    val subSteps: List<StepInfo>
    val status: StepStatus
    val throwable: Throwable?
}