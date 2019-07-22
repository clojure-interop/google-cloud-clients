(ns com.google.cloud.logging.LoggingLevel
  "This class adds some additional Java logging levels for Stackdriver Logging. Added levels fill in
  the gap between Java logging levels and Stackdriver Logging severities.

  Added levels in descending order are (between parenthesis the relation with Java logging
  levels):


    EMERGENCY
    ALERT
    CRITICAL
    ERROR (WARNING < ERROR < SEVERE)
    NOTICE (INFO < NOTICE < WARNING)
    DEBUG (ALL < DEBUG < FINEST


  Notice that ERROR is lower than Level.SEVERE but higher than
  Level.WARNING. DEBUG instead is lower than Level.FINEST but higher than Level.ALL."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging LoggingLevel]))

(def *-debug
  "Static Constant.

  A level to be used for debug or trace information. This level is initialized to 250.

  type: com.google.cloud.logging.LoggingLevel"
  LoggingLevel/DEBUG)

(def *-notice
  "Static Constant.

  A level to be used when normal events occur, such as start up and shut down. This level is
   initialized to 850.

  type: com.google.cloud.logging.LoggingLevel"
  LoggingLevel/NOTICE)

(def *-error
  "Static Constant.

  A level to be used when events occur that are likely to cause problems. This level is
   initialized to 950.

  type: com.google.cloud.logging.LoggingLevel"
  LoggingLevel/ERROR)

(def *-critical
  "Static Constant.

  A level to be used when critical events cause more severe problems or brief outages. This level
   is initialized to 1050.

  type: com.google.cloud.logging.LoggingLevel"
  LoggingLevel/CRITICAL)

(def *-alert
  "Static Constant.

  A level to be used when a person must take an action immediately. This level is initialized to
   1100.

  type: com.google.cloud.logging.LoggingLevel"
  LoggingLevel/ALERT)

(def *-emergency
  "Static Constant.

  A levet to be used when one or more systems are unusable. This level is initialized to 1150.

  type: com.google.cloud.logging.LoggingLevel"
  LoggingLevel/EMERGENCY)

(defn get-severity
  "Returns the Stackdriver Logging severity associated with this logging level.

  returns: `com.google.cloud.logging.Severity`"
  (^com.google.cloud.logging.Severity [^LoggingLevel this]
    (-> this (.getSeverity))))

