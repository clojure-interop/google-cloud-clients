(ns com.google.cloud.logging.LoggingOptions$DefaultLoggingFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging LoggingOptions$DefaultLoggingFactory]))

(defn ->default-logging-factory
  "Constructor."
  (^LoggingOptions$DefaultLoggingFactory []
    (new LoggingOptions$DefaultLoggingFactory )))

(defn create
  "options - `com.google.cloud.logging.LoggingOptions`

  returns: `com.google.cloud.logging.Logging`"
  (^com.google.cloud.logging.Logging [^LoggingOptions$DefaultLoggingFactory this ^com.google.cloud.logging.LoggingOptions options]
    (-> this (.create options))))

