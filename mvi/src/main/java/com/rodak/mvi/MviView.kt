package com.rodak.mvi

import io.reactivex.Observable

interface MviView<in V : MviViewState, I : MviIntent> {

    fun render(viewState: V)

    fun emitIntent(): Observable<I>

    fun emitIntentWithoutAction(): Observable<I> = Observable.never<I>()
}