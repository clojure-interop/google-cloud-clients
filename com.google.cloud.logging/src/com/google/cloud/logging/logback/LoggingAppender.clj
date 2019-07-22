(ns com.google.cloud.logging.logback.LoggingAppender
  "Logback appender for StackDriver Cloud Logging.

  Appender configuration in logback.xml:


    <appender name=\"CLOUD\" class=\"com.google.cloud.logging.logback.LoggingAppender\">
    <log>application.log</log> (Optional, defaults to \"java.log\" : Stackdriver log
        name)
    <level>ERROR</level> (Optional, defaults to \"INFO\" : logs at or above this
        level)
    <flushLevel>WARNING</flushLevel> (Optional, defaults to \"ERROR\")
    <resourceType></resourceType> (Optional, auto detects on App Engine Flex,
        Standard, GCE and GKE, defaults to \"global\". See supported resource
        types
    <credentialsFile>/path/to/credentials/file</credentialsFile> (Optional,
        defaults to the default credentials of the environment)
    (Optional) add custom labels to log entries using LoggingEnhancer classes.
    <enhancer>com.example.enhancer1</enhancer>
    <enhancer>com.example.enhancer2</enhancer>
    </appender>"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging.logback LoggingAppender]))

(defn ->logging-appender
  "Constructor."
  (^LoggingAppender []
    (new LoggingAppender )))

(defn set-flush-level
  "Batched logging requests get immediately flushed for logs at or above this level.

   Defaults to Error if not set.

  flush-level - Logback log level - `ch.qos.logback.classic.Level`"
  ([^LoggingAppender this ^ch.qos.logback.classic.Level flush-level]
    (-> this (.setFlushLevel flush-level))))

(defn set-log
  "Sets the log filename.

  log - filename - `java.lang.String`"
  ([^LoggingAppender this ^java.lang.String log]
    (-> this (.setLog log))))

(defn set-resource-type
  "Sets the name of the monitored resource (Optional).

   Must be a supported
   resource type. gae_app, gce_instance and container are auto-detected.

   Defaults to \"global\"

  resource-type - name of the monitored resource - `java.lang.String`"
  ([^LoggingAppender this ^java.lang.String resource-type]
    (-> this (.setResourceType resource-type))))

(defn set-credentials-file
  "Sets the credentials file to use to create the LoggingOptions. The credentials returned
   by GoogleCredentials.getApplicationDefault() will be used if no custom credentials file
   has been set.

  credentials-file - The credentials file to use. - `java.lang.String`"
  ([^LoggingAppender this ^java.lang.String credentials-file]
    (-> this (.setCredentialsFile credentials-file))))

(defn add-enhancer
  "Add extra labels using classes that implement LoggingEnhancer.

  enhancer-class-name - `java.lang.String`"
  ([^LoggingAppender this ^java.lang.String enhancer-class-name]
    (-> this (.addEnhancer enhancer-class-name))))

(defn add-logging-event-enhancer
  "enhancer-class-name - `java.lang.String`"
  ([^LoggingAppender this ^java.lang.String enhancer-class-name]
    (-> this (.addLoggingEventEnhancer enhancer-class-name))))

(defn start
  "Initialize and configure the cloud logging service."
  ([^LoggingAppender this]
    (-> this (.start))))

(defn stop
  ""
  ([^LoggingAppender this]
    (-> this (.stop))))

