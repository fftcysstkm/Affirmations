package com.demo.android.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/*
* 「格言」のStringリソースおよび画像リソースIDを保持するDataクラス
* (使用者がIDを間違えないようにアノテーション付与)
* */
data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
) {

}