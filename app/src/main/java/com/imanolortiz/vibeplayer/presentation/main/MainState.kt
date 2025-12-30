package com.imanolortiz.vibeplayer.presentation.main

sealed class ScanningState<out T> {
    data object Scanning: ScanningState<Nothing>()
    data class Success<T>(val data: T): ScanningState<T>()
}