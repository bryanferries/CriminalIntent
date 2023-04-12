package com.bignerdranch.android.criminalintent

import java.util.*
//Class to create Crime objects
data class Crime(val id: UUID = UUID.randomUUID(),
                var title: String = "",
                var date: Date = Date(),
                var isSolved: Boolean = false)

