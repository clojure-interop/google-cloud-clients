(ns com.google.cloud.logging.Logging$WriteOption
  "Class for specifying options for writing log entries."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging Logging$WriteOption]))

(defn *log-name
  "Returns an option to specify a default log name (see LogEntry.getLogName()) for those
   log entries that do not specify their own log name. Example: syslog.

  log-name - `java.lang.String`

  returns: `com.google.cloud.logging.Logging$WriteOption`"
  (^com.google.cloud.logging.Logging$WriteOption [^java.lang.String log-name]
    (Logging$WriteOption/logName log-name)))

(defn *resource
  "Returns an option to specify a default monitored resource (see LogEntry.getResource()) for those log entries that do not specify their own resource.

  resource - `com.google.cloud.MonitoredResource`

  returns: `com.google.cloud.logging.Logging$WriteOption`"
  (^com.google.cloud.logging.Logging$WriteOption [^com.google.cloud.MonitoredResource resource]
    (Logging$WriteOption/resource resource)))

(defn *labels
  "Sets an option to specify (key, value) pairs that are added to the LogEntry.getLabels() of each log entry written, except when a log entry already has a value
   associated to the same key.

  labels - `java.util.Map`

  returns: `com.google.cloud.logging.Logging$WriteOption`"
  (^com.google.cloud.logging.Logging$WriteOption [^java.util.Map labels]
    (Logging$WriteOption/labels labels)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Logging$WriteOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Logging$WriteOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Logging$WriteOption this]
    (-> this (.toString))))

