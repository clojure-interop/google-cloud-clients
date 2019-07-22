(ns com.google.cloud.notification.NotificationInfo$PayloadFormat
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.notification NotificationInfo$PayloadFormat]))

(def JSON_API_V1
  "Enum Constant.

  type: com.google.cloud.notification.NotificationInfo$PayloadFormat"
  NotificationInfo$PayloadFormat/JSON_API_V1)

(def NONE
  "Enum Constant.

  type: com.google.cloud.notification.NotificationInfo$PayloadFormat"
  NotificationInfo$PayloadFormat/NONE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (NotificationInfo.PayloadFormat c : NotificationInfo.PayloadFormat.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.notification.NotificationInfo$PayloadFormat[]`"
  ([]
    (NotificationInfo$PayloadFormat/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.notification.NotificationInfo$PayloadFormat`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.notification.NotificationInfo$PayloadFormat [^java.lang.String name]
    (NotificationInfo$PayloadFormat/valueOf name)))

