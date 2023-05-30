package com.wahidabd.composeui.data.repository.onboarding

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import androidx.datastore.preferences.preferencesDataStore
import com.wahidabd.composeui.utils.Constant.ON_BOARDING_KEY
import com.wahidabd.composeui.utils.Constant.ON_BOARDING_NAME
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import java.io.IOException


/**
 * Created by Wahid on 5/30/2023.
 * Github github.com/wahidabd.
 */

val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = ON_BOARDING_NAME)

class OnBoardingImpl(context: Context) : OnBoardingOperations{

    private object PreferencesKey {
        val onBoardingKey = booleanPreferencesKey(name = ON_BOARDING_KEY)
    }

    private val dataStore = context.dataStore

    override suspend fun saveBoardingState(isCompleted: Boolean) {
        dataStore.edit { preferences ->
            preferences[PreferencesKey.onBoardingKey] = isCompleted
        }
    }

    override fun readOnBoardingState(): Flow<Boolean> {
        return dataStore.data
            .catch { exception ->
                if (exception is IOException) emit(emptyPreferences())
                else throw exception
            }
            .map { preferences ->
                val onBoardingState = preferences[PreferencesKey.onBoardingKey] ?: false
                onBoardingState
            }
    }
}