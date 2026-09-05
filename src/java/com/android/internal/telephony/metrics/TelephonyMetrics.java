package com.android.internal.telephony.metrics;

/**
 * Compatibility shim for legacy MediaTek IMS blobs.
 *
 * TelephonyMetrics was removed from newer Android releases, but the
 * Android 13 MediaTek ImsService still references it. These methods
 * were only used for telephony metrics collection, so keep them as
 * no-ops for blob compatibility.
 */
public final class TelephonyMetrics {
    private static final TelephonyMetrics sInstance = new TelephonyMetrics();

    private TelephonyMetrics() {}

    public static TelephonyMetrics getInstance() {
        return sInstance;
    }

    public void writeOnRilTimeoutResponse(
            int phoneId, int serial, int request) {
    }

    public void writeOnRilSolicitedResponse(
            int phoneId, int serial, int error,
            int request, Object ret) {
    }

    public void writeRilAnswer(
            int phoneId, int serial) {
    }

    public void writeRilSendSms(
            int phoneId, int serial, int tech,
            int format, long messageId) {
    }
}
