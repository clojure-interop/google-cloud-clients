(ns com.google.cloud.logging.logback.LoggingEventEnhancer
  "An enhancer for ILoggingEvent log entries. Used to add custom labels to the LogEntry.Builder."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging.logback LoggingEventEnhancer]))

(defn enhance-log-entry
  "builder - `com.google.cloud.logging.LogEntry$Builder`
  e - `ch.qos.logback.classic.spi.ILoggingEvent`"
  ([^LoggingEventEnhancer this ^com.google.cloud.logging.LogEntry$Builder builder ^ch.qos.logback.classic.spi.ILoggingEvent e]
    (-> this (.enhanceLogEntry builder e))))

