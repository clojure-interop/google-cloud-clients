(ns com.google.cloud.logging.LoggingOptions$DefaultLoggingRpcFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging LoggingOptions$DefaultLoggingRpcFactory]))

(defn ->default-logging-rpc-factory
  "Constructor."
  (^LoggingOptions$DefaultLoggingRpcFactory []
    (new LoggingOptions$DefaultLoggingRpcFactory )))

(defn create
  "options - `com.google.cloud.logging.LoggingOptions`

  returns: `com.google.cloud.ServiceRpc`"
  (^com.google.cloud.ServiceRpc [^LoggingOptions$DefaultLoggingRpcFactory this ^com.google.cloud.logging.LoggingOptions options]
    (-> this (.create options))))

