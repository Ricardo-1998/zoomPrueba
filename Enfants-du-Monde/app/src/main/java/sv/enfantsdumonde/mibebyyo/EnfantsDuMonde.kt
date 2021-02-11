package sv.enfantsdumonde.mibebyyo

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import sv.enfantsdumonde.mibebyyo.di.viewModelModule

class EnfantsDuMonde: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@EnfantsDuMonde)
            modules(listOf(viewModelModule))
        }
    }

}