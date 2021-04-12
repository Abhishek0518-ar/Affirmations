package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource {

    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
                Affirmation(R.string.a),
                Affirmation(R.string.b),
                Affirmation(R.string.c),
                Affirmation(R.string.d),
                Affirmation(R.string.e),
                Affirmation(R.string.f),
                Affirmation(R.string.g),
                Affirmation(R.string.h),
                Affirmation(R.string.i),
                Affirmation(R.string.j),
                Affirmation(R.string.k),
                Affirmation(R.string.l),
                Affirmation(R.string.m),
                Affirmation(R.string.n),
                Affirmation(R.string.o),
                Affirmation(R.string.p),
                Affirmation(R.string.q),
                Affirmation(R.string.r),
                Affirmation(R.string.s),
                Affirmation(R.string.t),
                Affirmation(R.string.u),
                Affirmation(R.string.v),
                Affirmation(R.string.w),
                Affirmation(R.string.x),
                Affirmation(R.string.y),
                Affirmation(R.string.z),

        )
    }
}