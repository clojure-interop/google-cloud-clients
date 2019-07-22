(ns com.google.cloud.logging.LogEntry$Builder
  "A builder for LogEntry objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging LogEntry$Builder]))

(defn set-labels
  "Sets an optional set of user-defined (key, value) data that provides additional information
   about the log entry.

  labels - `java.util.Map`

  returns: `com.google.cloud.logging.LogEntry$Builder`"
  (^com.google.cloud.logging.LogEntry$Builder [^LogEntry$Builder this ^java.util.Map labels]
    (-> this (.setLabels labels))))

(defn set-insert-id
  "Sets a unique ID for the log entry. If you provide this field, the Logging service considers
   other log entries in the same log with the same ID as duplicates which can be removed. If
   omitted, the Logging service will generate a unique ID for this log entry.

  insert-id - `java.lang.String`

  returns: `com.google.cloud.logging.LogEntry$Builder`"
  (^com.google.cloud.logging.LogEntry$Builder [^LogEntry$Builder this ^java.lang.String insert-id]
    (-> this (.setInsertId insert-id))))

(defn set-resource
  "Sets the monitored resource associated with this log entry. Example: a log entry that reports
   a database error would be associated with the monitored resource designating the particular
   database that reported the error.

  resource - `com.google.cloud.MonitoredResource`

  returns: `com.google.cloud.logging.LogEntry$Builder`"
  (^com.google.cloud.logging.LogEntry$Builder [^LogEntry$Builder this ^com.google.cloud.MonitoredResource resource]
    (-> this (.setResource resource))))

(defn set-timestamp
  "Sets the time at which the event described by the log entry occurred, in milliseconds. If
   omitted, the Logging service will use the time at which the log entry is received.

  timestamp - `long`

  returns: `com.google.cloud.logging.LogEntry$Builder`"
  (^com.google.cloud.logging.LogEntry$Builder [^LogEntry$Builder this ^Long timestamp]
    (-> this (.setTimestamp timestamp))))

(defn set-operation
  "Sets information about an operation associated with the log entry, if applicable.

  operation - `com.google.cloud.logging.Operation`

  returns: `com.google.cloud.logging.LogEntry$Builder`"
  (^com.google.cloud.logging.LogEntry$Builder [^LogEntry$Builder this ^com.google.cloud.logging.Operation operation]
    (-> this (.setOperation operation))))

(defn set-receive-timestamp
  "Sets the time the log entry was received by Stackdriver Logging.

  receive-timestamp - `long`

  returns: `com.google.cloud.logging.LogEntry$Builder`"
  (^com.google.cloud.logging.LogEntry$Builder [^LogEntry$Builder this ^Long receive-timestamp]
    (-> this (.setReceiveTimestamp receive-timestamp))))

(defn clear-labels
  "Clears all the labels of the log entry. Labels are user-defined (key, value) data that
   provides additional information about the log entry.

  returns: `com.google.cloud.logging.LogEntry$Builder`"
  (^com.google.cloud.logging.LogEntry$Builder [^LogEntry$Builder this]
    (-> this (.clearLabels))))

(defn set-source-location
  "Sets the source code location information associated with the log entry if any.

  source-location - `com.google.cloud.logging.SourceLocation`

  returns: `com.google.cloud.logging.LogEntry$Builder`"
  (^com.google.cloud.logging.LogEntry$Builder [^LogEntry$Builder this ^com.google.cloud.logging.SourceLocation source-location]
    (-> this (.setSourceLocation source-location))))

(defn set-span-id
  "Sets the ID of the trace span associated with the log entry, if any.

  span-id - `java.lang.String`

  returns: `com.google.cloud.logging.LogEntry$Builder`"
  (^com.google.cloud.logging.LogEntry$Builder [^LogEntry$Builder this ^java.lang.String span-id]
    (-> this (.setSpanId span-id))))

(defn set-trace-sampled
  "Sets the sampling decision of the trace span associated with the log entry.

  trace-sampled - `boolean`

  returns: `com.google.cloud.logging.LogEntry$Builder`"
  (^com.google.cloud.logging.LogEntry$Builder [^LogEntry$Builder this ^Boolean trace-sampled]
    (-> this (.setTraceSampled trace-sampled))))

(defn build
  "Creates a LogEntry object for this builder.

  returns: `com.google.cloud.logging.LogEntry`"
  (^com.google.cloud.logging.LogEntry [^LogEntry$Builder this]
    (-> this (.build))))

(defn set-severity
  "Sets the severity of the log entry. If not set, Severity.DEFAULT is used.

  severity - `com.google.cloud.logging.Severity`

  returns: `com.google.cloud.logging.LogEntry$Builder`"
  (^com.google.cloud.logging.LogEntry$Builder [^LogEntry$Builder this ^com.google.cloud.logging.Severity severity]
    (-> this (.setSeverity severity))))

(defn add-label
  "Adds a label to the log entry's labels. Labels are user-defined (key, value) data that
   provides additional information about the log entry.

  key - `java.lang.String`
  value - `java.lang.String`

  returns: `com.google.cloud.logging.LogEntry$Builder`"
  (^com.google.cloud.logging.LogEntry$Builder [^LogEntry$Builder this ^java.lang.String key ^java.lang.String value]
    (-> this (.addLabel key value))))

(defn set-payload
  "Sets the payload for this log entry. The log entry payload can be provided as an UTF-8 string
   (see Payload.StringPayload), a JSON object (see Payload.JsonPayload, or a
   protobuf object (see Payload.ProtoPayload).

  payload - `com.google.cloud.logging.Payload`

  returns: `com.google.cloud.logging.LogEntry$Builder`"
  (^com.google.cloud.logging.LogEntry$Builder [^LogEntry$Builder this ^com.google.cloud.logging.Payload payload]
    (-> this (.setPayload payload))))

(defn set-trace
  "Sets the resource name of the trace associated with the log entry, if any. If it contains a
   relative resource name, the name is assumed to be relative to `//tracing.googleapis.com`.

  trace - `java.lang.String`

  returns: `com.google.cloud.logging.LogEntry$Builder`"
  (^com.google.cloud.logging.LogEntry$Builder [^LogEntry$Builder this ^java.lang.String trace]
    (-> this (.setTrace trace))))

(defn set-http-request
  "Sets information about the HTTP request associated with this log entry, if applicable.

  http-request - `com.google.cloud.logging.HttpRequest`

  returns: `com.google.cloud.logging.LogEntry$Builder`"
  (^com.google.cloud.logging.LogEntry$Builder [^LogEntry$Builder this ^com.google.cloud.logging.HttpRequest http-request]
    (-> this (.setHttpRequest http-request))))

(defn set-log-name
  "Sets the name of the log to which this log entry belongs. The log name must be less than 512
   characters long and can only include the following characters: upper and lower case
   alphanumeric characters: [A-Za-z0-9]; and punctuation characters: _-./. The
   forward-slash (/) characters in the log name must be URL-encoded. Examples: syslog, library.googleapis.com%2Fbook_log.

  log-name - `java.lang.String`

  returns: `com.google.cloud.logging.LogEntry$Builder`"
  (^com.google.cloud.logging.LogEntry$Builder [^LogEntry$Builder this ^java.lang.String log-name]
    (-> this (.setLogName log-name))))

