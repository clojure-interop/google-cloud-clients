(ns com.google.cloud.logging.testing.RemoteLoggingHelper$LoggingHelperException
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging.testing RemoteLoggingHelper$LoggingHelperException]))

(defn ->logging-helper-exception
  "Constructor.

  message - `java.lang.String`
  cause - `java.lang.Throwable`"
  (^RemoteLoggingHelper$LoggingHelperException [^java.lang.String message ^java.lang.Throwable cause]
    (new RemoteLoggingHelper$LoggingHelperException message cause)))

(defn *translate
  "ex - `java.lang.Exception`

  returns: `com.google.cloud.logging.testing.RemoteLoggingHelper$LoggingHelperException`"
  (^com.google.cloud.logging.testing.RemoteLoggingHelper$LoggingHelperException [^java.lang.Exception ex]
    (RemoteLoggingHelper$LoggingHelperException/translate ex)))

