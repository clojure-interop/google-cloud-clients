(ns com.google.cloud.logging.Severity
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging Severity]))

(def DEFAULT
  "Enum Constant.

  The log entry has no assigned severity level.

  type: com.google.cloud.logging.Severity"
  Severity/DEFAULT)

(def DEBUG
  "Enum Constant.

  Debug or trace information.

  type: com.google.cloud.logging.Severity"
  Severity/DEBUG)

(def INFO
  "Enum Constant.

  Routine information, such as ongoing status or performance.

  type: com.google.cloud.logging.Severity"
  Severity/INFO)

(def NOTICE
  "Enum Constant.

  Normal but significant events, such as start up, shut down, or configuration.

  type: com.google.cloud.logging.Severity"
  Severity/NOTICE)

(def WARNING
  "Enum Constant.

  Warning events might cause problems.

  type: com.google.cloud.logging.Severity"
  Severity/WARNING)

(def ERROR
  "Enum Constant.

  Error events are likely to cause problems.

  type: com.google.cloud.logging.Severity"
  Severity/ERROR)

(def CRITICAL
  "Enum Constant.

  Critical events cause more severe problems or brief outages.

  type: com.google.cloud.logging.Severity"
  Severity/CRITICAL)

(def ALERT
  "Enum Constant.

  A person must take an action immediately.

  type: com.google.cloud.logging.Severity"
  Severity/ALERT)

(def EMERGENCY
  "Enum Constant.

  One or more systems are unusable.

  type: com.google.cloud.logging.Severity"
  Severity/EMERGENCY)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Severity c : Severity.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.logging.Severity[]`"
  ([]
    (Severity/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.logging.Severity`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.logging.Severity [^java.lang.String name]
    (Severity/valueOf name)))

