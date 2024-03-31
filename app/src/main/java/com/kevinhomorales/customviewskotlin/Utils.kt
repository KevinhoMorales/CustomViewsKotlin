package com.kevinhomorales.customviewskotlin

import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.widget.Toast

fun Activity.showConfirmationDialog(
    title: String,
    message: String,
    positiveButtonTitle: String = "OK",
    negativeButtonTitle: String = "Cancelar",
    positiveAction: () -> Unit = {}
) {
    AlertDialog.Builder(this)
        .setTitle(title)
        .setMessage(message)
        .setPositiveButton(positiveButtonTitle) { dialog, _ ->
            positiveAction.invoke()
            dialog.dismiss()
        }
        .setNegativeButton(negativeButtonTitle) { dialog, _ ->
            dialog.dismiss()
        }
        .show()
}

fun showToast(context: Context, message: String) {
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}