package com.rodak.mvi

interface MviAction<V : MviViewState> {

    fun reduce(previousState: V): V
}