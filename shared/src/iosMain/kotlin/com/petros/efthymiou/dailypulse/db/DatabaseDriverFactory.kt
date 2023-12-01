package com.petros.efthymiou.dailypulse.db

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.native.NativeSqliteDriver
import petros.efthymiou.dailypulse.db.DailyPulseDatabase

actual class DatabaseDriverFactory() {

    actual fun createDriver(): SqlDriver =
        NativeSqliteDriver(
            schema = DailyPulseDatabase.Schema,
            name = "DailyPulseDatabase.db"
        )
}