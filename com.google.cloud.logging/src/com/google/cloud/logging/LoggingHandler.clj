(ns com.google.cloud.logging.LoggingHandler
  "A logging handler that outputs logs generated with Logger to
  Stackdriver Logging.

  Java logging levels (see Level) are mapped to the following Google
  Stackdriver Logging severities:


  Java LevelStackdriver Logging Severity
  SEVEREERROR
  WARNINGWARNING
  INFOINFO
  CONFIGINFO
  FINEDEBUG
  FINERDEBUG
  FINESTDEBUG


  Original Java logging levels are added as labels (with levelName and levelValue keys, respectively) to the corresponding Stackdriver Logging LogEntry. You
  can read entry labels using LogEntry.getLabels(). To use logging levels that correspond
  to Stackdriver Logging severities you can use LoggingLevel.

  Configuration: By default each LoggingHandler is initialized using the
  following LogManager configuration properties (that you can set in the logging.properties file). If properties are not defined (or have invalid values) then the
  specified default values are used.


    com.google.cloud.logging.LoggingHandler.log the log name (defaults to java.log).
    com.google.cloud.logging.LoggingHandler.level specifies the default level for the
        handler (defaults to Level.INFO).
    com.google.cloud.logging.LoggingHandler.filter specifies the name of a Filter class to use (defaults to no filter).
    com.google.cloud.logging.LoggingHandler.formatter specifies the name of a Formatter class to use (defaults to SimpleFormatter).
    com.google.cloud.logging.LoggingHandler.flushLevel specifies the flush log level.
        When a log with this level is published, logs are transmitted to the Stackdriver Logging
        service (defaults to LoggingLevel.ERROR).
    com.google.cloud.logging.LoggingHandler.enhancers specifies a comma separated list
        of LoggingEnhancer classes. This handler will call each enhancer list whenever it
        builds a LogEntry instance (defaults to empty list).
    com.google.cloud.logging.LoggingHandler.resourceType the type name to use when
        creating the default MonitoredResource (defaults to auto-detected resource type,
        else \"global\").
    com.google.cloud.logging.Synchronicity the synchronicity of the write method to use
        to write logs to the Stackdriver Logging service (defaults to Synchronicity.ASYNC).


  To add a LoggingHandler to an existing Logger and be sure to avoid infinite
  recursion when logging, use the addHandler(Logger, LoggingHandler) method. Alternatively
  you can add the handler via logging.properties. For example using the following line:



   com.example.mypackage.handlers=com.google.cloud.logging.LoggingHandler"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging LoggingHandler]))

(defn ->logging-handler
  "Constructor.

  Creates a handler that publishes messages to Stackdriver Logging.

  log - the name of the log to which log entries are written - `java.lang.String`
  options - options for the Stackdriver Logging service - `com.google.cloud.logging.LoggingOptions`
  monitored-resource - the monitored resource to which log entries refer. If it is null then a default resource is created based on the project ID and deployment environment. - `com.google.cloud.MonitoredResource`
  enhancers - List of LoggingEnhancer instances used to enhance anyLogEntry instances built by this handler. - `java.util.List`"
  (^LoggingHandler [^java.lang.String log ^com.google.cloud.logging.LoggingOptions options ^com.google.cloud.MonitoredResource monitored-resource ^java.util.List enhancers]
    (new LoggingHandler log options monitored-resource enhancers))
  (^LoggingHandler [^java.lang.String log ^com.google.cloud.logging.LoggingOptions options ^com.google.cloud.MonitoredResource monitored-resource]
    (new LoggingHandler log options monitored-resource))
  (^LoggingHandler [^java.lang.String log ^com.google.cloud.logging.LoggingOptions options]
    (new LoggingHandler log options))
  (^LoggingHandler [^java.lang.String log]
    (new LoggingHandler log))
  (^LoggingHandler []
    (new LoggingHandler )))

(defn *add-handler
  "Adds the provided LoggingHandler to logger. Use this method to register Cloud
   Logging handlers instead of Logger.addHandler(Handler) to avoid infinite recursion when
   logging.

  logger - `java.util.logging.Logger`
  handler - `com.google.cloud.logging.LoggingHandler`"
  ([^java.util.logging.Logger logger ^com.google.cloud.logging.LoggingHandler handler]
    (LoggingHandler/addHandler logger handler)))

(defn publish
  "record - `java.util.logging.LogRecord`"
  ([^LoggingHandler this ^java.util.logging.LogRecord record]
    (-> this (.publish record))))

(defn flush
  ""
  ([^LoggingHandler this]
    (-> this (.flush))))

(defn close
  "Closes the handler and the associated Logging object.

  throws: java.lang.SecurityException"
  ([^LoggingHandler this]
    (-> this (.close))))

(defn get-flush-level
  "Get the flush log level.

  returns: `java.util.logging.Level`"
  (^java.util.logging.Level [^LoggingHandler this]
    (-> this (.getFlushLevel))))

(defn set-flush-level
  "Sets minimum logging level to log immediately and flush any pending writes.

  flush-level - minimum log level to trigger flush - `java.util.logging.Level`"
  ([^LoggingHandler this ^java.util.logging.Level flush-level]
    (-> this (.setFlushLevel flush-level))))

(defn set-synchronicity
  "Sets synchronicity of logging writes. By default, writes are asynchronous.

  synchronicity - Synchronicity - `com.google.cloud.logging.Synchronicity`"
  ([^LoggingHandler this ^com.google.cloud.logging.Synchronicity synchronicity]
    (-> this (.setSynchronicity synchronicity))))

(defn get-synchronicity
  "Get the flush log level.

  returns: `com.google.cloud.logging.Synchronicity`"
  (^com.google.cloud.logging.Synchronicity [^LoggingHandler this]
    (-> this (.getSynchronicity))))

