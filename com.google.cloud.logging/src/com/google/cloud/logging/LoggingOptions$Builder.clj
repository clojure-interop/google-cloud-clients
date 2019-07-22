(ns com.google.cloud.logging.LoggingOptions$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging LoggingOptions$Builder]))

(defn set-transport-options
  "Description copied from class: ServiceOptions.Builder

  transport-options - `com.google.cloud.TransportOptions`

  returns: the builder - `com.google.cloud.logging.LoggingOptions$Builder`"
  (^com.google.cloud.logging.LoggingOptions$Builder [^LoggingOptions$Builder this ^com.google.cloud.TransportOptions transport-options]
    (-> this (.setTransportOptions transport-options))))

(defn build
  "returns: `com.google.cloud.logging.LoggingOptions`"
  (^com.google.cloud.logging.LoggingOptions [^LoggingOptions$Builder this]
    (-> this (.build))))

