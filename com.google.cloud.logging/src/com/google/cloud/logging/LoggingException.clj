(ns com.google.cloud.logging.LoggingException
  "Logging service exception."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging LoggingException]))

(defn ->logging-exception
  "Constructor.

  ex - `java.io.IOException`
  idempotent - `boolean`"
  (^LoggingException [^java.io.IOException ex ^Boolean idempotent]
    (new LoggingException ex idempotent))
  (^LoggingException [^com.google.api.gax.rpc.ApiException api-exception]
    (new LoggingException api-exception)))

