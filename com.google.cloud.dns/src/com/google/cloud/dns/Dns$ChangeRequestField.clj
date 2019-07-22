(ns com.google.cloud.dns.Dns$ChangeRequestField
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dns Dns$ChangeRequestField]))

(def ID
  "Enum Constant.

  type: com.google.cloud.dns.Dns$ChangeRequestField"
  Dns$ChangeRequestField/ID)

(def START_TIME
  "Enum Constant.

  type: com.google.cloud.dns.Dns$ChangeRequestField"
  Dns$ChangeRequestField/START_TIME)

(def STATUS
  "Enum Constant.

  type: com.google.cloud.dns.Dns$ChangeRequestField"
  Dns$ChangeRequestField/STATUS)

(def ADDITIONS
  "Enum Constant.

  type: com.google.cloud.dns.Dns$ChangeRequestField"
  Dns$ChangeRequestField/ADDITIONS)

(def DELETIONS
  "Enum Constant.

  type: com.google.cloud.dns.Dns$ChangeRequestField"
  Dns$ChangeRequestField/DELETIONS)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Dns.ChangeRequestField c : Dns.ChangeRequestField.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.dns.Dns$ChangeRequestField[]`"
  ([]
    (Dns$ChangeRequestField/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.dns.Dns$ChangeRequestField`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.dns.Dns$ChangeRequestField [^java.lang.String name]
    (Dns$ChangeRequestField/valueOf name)))

(defn get-selector
  "Description copied from interface: FieldSelector

  returns: `java.lang.String`"
  (^java.lang.String [^Dns$ChangeRequestField this]
    (-> this (.getSelector))))

