(ns com.google.cloud.spanner.SpannerException
  "Base exception type for all exceptions produced by the Cloud Spanner service."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner SpannerException]))

(defn get-error-code
  "Returns the error code associated with this exception.

  returns: `com.google.cloud.spanner.ErrorCode`"
  (^com.google.cloud.spanner.ErrorCode [^SpannerException this]
    (-> this (.getErrorCode))))

(defn get-retry-delay-in-millis
  "Return the retry delay for operation in milliseconds. Return -1 if this does not specify any
   retry delay.

  returns: `long`"
  (^Long [^SpannerException this]
    (-> this (.getRetryDelayInMillis))))

