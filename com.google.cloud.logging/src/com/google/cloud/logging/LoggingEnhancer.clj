(ns com.google.cloud.logging.LoggingEnhancer
  "An enhancer for log entries. Used to add custom labels to the LogEntry.Builder"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging LoggingEnhancer]))

(defn enhance-log-entry
  "builder - `com.google.cloud.logging.LogEntry$Builder`"
  ([^LoggingEnhancer this ^com.google.cloud.logging.LogEntry$Builder builder]
    (-> this (.enhanceLogEntry builder))))

