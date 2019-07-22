(ns com.google.cloud.logging.TraceLoggingEnhancer
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging TraceLoggingEnhancer]))

(defn ->trace-logging-enhancer
  "Constructor.

  prefix - `java.lang.String`"
  (^TraceLoggingEnhancer [^java.lang.String prefix]
    (new TraceLoggingEnhancer prefix))
  (^TraceLoggingEnhancer []
    (new TraceLoggingEnhancer )))

(defn *set-current-trace-id
  "Set the Trace ID associated with any logging done by the current thread.

  id - The traceID, in the form projects/[PROJECT_ID]/traces/[TRACE_ID] - `java.lang.String`"
  ([^java.lang.String id]
    (TraceLoggingEnhancer/setCurrentTraceId id)))

(defn *get-current-trace-id
  "Get the Trace ID associated with any logging done by the current thread.

  returns: id The traceID - `java.lang.String`"
  (^java.lang.String []
    (TraceLoggingEnhancer/getCurrentTraceId )))

(defn enhance-log-entry
  "builder - `com.google.cloud.logging.LogEntry$Builder`"
  ([^TraceLoggingEnhancer this ^com.google.cloud.logging.LogEntry$Builder builder]
    (-> this (.enhanceLogEntry builder))))

