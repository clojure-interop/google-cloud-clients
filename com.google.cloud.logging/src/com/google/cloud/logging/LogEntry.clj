(ns com.google.cloud.logging.LogEntry
  "A Stackdriver Logging log entry. All log entries are represented via objects of this class. Log
  entries can have different type of payloads: an UTF-8 string (see Payload.StringPayload),
  a JSON object (see Payload.JsonPayload, or a protobuf object (see Payload.ProtoPayload). Entries can also store additional information about the operation or the
  HTTP request that generated the log (see getOperation() and getHttpRequest(), respectively)."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging LogEntry]))

(defn *new-builder
  "Returns a builder for LogEntry objects given the entry payload.

  payload - `com.google.cloud.logging.Payload`

  returns: `com.google.cloud.logging.LogEntry$Builder`"
  (^com.google.cloud.logging.LogEntry$Builder [^com.google.cloud.logging.Payload payload]
    (LogEntry/newBuilder payload)))

(defn *of
  "Creates a LogEntry object given the log name, the monitored resource and the entry
   payload.

  log-name - `java.lang.String`
  resource - `com.google.cloud.MonitoredResource`
  payload - `com.google.cloud.logging.Payload`

  returns: `com.google.cloud.logging.LogEntry`"
  (^com.google.cloud.logging.LogEntry [^java.lang.String log-name ^com.google.cloud.MonitoredResource resource ^com.google.cloud.logging.Payload payload]
    (LogEntry/of log-name resource payload))
  (^com.google.cloud.logging.LogEntry [^com.google.cloud.logging.Payload payload]
    (LogEntry/of payload)))

(defn get-trace
  "Returns the resource name of the trace associated with the log entry, if any. If it contains a
   relative resource name, the name is assumed to be relative to `//tracing.googleapis.com`.

  returns: `java.lang.String`"
  (^java.lang.String [^LogEntry this]
    (-> this (.getTrace))))

(defn get-resource
  "Returns the monitored resource associated with this log entry. Example: a log entry that
   reports a database error would be associated with the monitored resource designating the
   particular database that reported the error.

  returns: `com.google.cloud.MonitoredResource`"
  (^com.google.cloud.MonitoredResource [^LogEntry this]
    (-> this (.getResource))))

(defn get-severity
  "Returns the severity of the log entry. If not set, Severity.DEFAULT is used.

  returns: `com.google.cloud.logging.Severity`"
  (^com.google.cloud.logging.Severity [^LogEntry this]
    (-> this (.getSeverity))))

(defn get-timestamp
  "Returns the time at which the event described by the log entry occurred, in milliseconds. If
   omitted, the Logging service will use the time at which the log entry is received.

  returns: `java.lang.Long`"
  (^java.lang.Long [^LogEntry this]
    (-> this (.getTimestamp))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^LogEntry this]
    (-> this (.toString))))

(defn get-payload
  "Returns the payload for this log entry. The log entry payload can be an UTF-8 string (see
   Payload.StringPayload), a JSON object (see Payload.JsonPayload, or a protobuf
   object (see Payload.ProtoPayload).

  returns: `<T extends com.google.cloud.logging.Payload> T`"
  ([^LogEntry this]
    (-> this (.getPayload))))

(defn get-trace-sampled?
  "Returns the sampling decision of the trace span associated with the log entry, or false
   if there is no trace span.

  returns: `boolean`"
  (^Boolean [^LogEntry this]
    (-> this (.getTraceSampled))))

(defn get-span-id
  "Returns the ID of the trace span associated with the log entry, if any.

  returns: `java.lang.String`"
  (^java.lang.String [^LogEntry this]
    (-> this (.getSpanId))))

(defn get-labels
  "Returns an optional set of user-defined (key, value) data that provides additional information
   about the log entry.

  returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^LogEntry this]
    (-> this (.getLabels))))

(defn get-receive-timestamp
  "Returns the time the log entry was received by Stackdriver Logging.

  returns: `java.lang.Long`"
  (^java.lang.Long [^LogEntry this]
    (-> this (.getReceiveTimestamp))))

(defn get-http-request
  "Returns information about the HTTP request associated with this log entry, if applicable.

  returns: `com.google.cloud.logging.HttpRequest`"
  (^com.google.cloud.logging.HttpRequest [^LogEntry this]
    (-> this (.getHttpRequest))))

(defn hash-code
  "returns: `int`"
  (^Integer [^LogEntry this]
    (-> this (.hashCode))))

(defn get-operation
  "Returns information about an operation associated with the log entry, if applicable.

  returns: `com.google.cloud.logging.Operation`"
  (^com.google.cloud.logging.Operation [^LogEntry this]
    (-> this (.getOperation))))

(defn get-log-name
  "Returns the name of the log to which this log entry belongs. The log name must be less than 512
   characters long and can only include the following characters: upper and lower case
   alphanumeric characters: [A-Za-z0-9]; and punctuation characters: _-./. The
   forward-slash (/) characters in the log name must be URL-encoded. Examples: syslog, library.googleapis.com%2Fbook_log.

  returns: `java.lang.String`"
  (^java.lang.String [^LogEntry this]
    (-> this (.getLogName))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^LogEntry this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn get-insert-id
  "Returns a unique ID for the log entry. The Logging service considers other log entries in the
   same log with the same ID as duplicates which can be removed.

  returns: `java.lang.String`"
  (^java.lang.String [^LogEntry this]
    (-> this (.getInsertId))))

(defn to-builder
  "Returns a Builder for this log entry.

  returns: `com.google.cloud.logging.LogEntry$Builder`"
  (^com.google.cloud.logging.LogEntry$Builder [^LogEntry this]
    (-> this (.toBuilder))))

(defn get-source-location
  "Returns the source code location information associated with the log entry, if any.

  returns: `com.google.cloud.logging.SourceLocation`"
  (^com.google.cloud.logging.SourceLocation [^LogEntry this]
    (-> this (.getSourceLocation))))

