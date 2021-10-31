package com.usati.fcmapp

data class PushNotification(
    val data: NotificationData,
    val to: String
)