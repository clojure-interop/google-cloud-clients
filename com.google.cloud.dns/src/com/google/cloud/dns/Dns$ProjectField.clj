(ns com.google.cloud.dns.Dns$ProjectField
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dns Dns$ProjectField]))

(def PROJECT_ID
  "Enum Constant.

  type: com.google.cloud.dns.Dns$ProjectField"
  Dns$ProjectField/PROJECT_ID)

(def PROJECT_NUMBER
  "Enum Constant.

  type: com.google.cloud.dns.Dns$ProjectField"
  Dns$ProjectField/PROJECT_NUMBER)

(def QUOTA
  "Enum Constant.

  type: com.google.cloud.dns.Dns$ProjectField"
  Dns$ProjectField/QUOTA)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Dns.ProjectField c : Dns.ProjectField.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.dns.Dns$ProjectField[]`"
  ([]
    (Dns$ProjectField/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.dns.Dns$ProjectField`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.dns.Dns$ProjectField [^java.lang.String name]
    (Dns$ProjectField/valueOf name)))

(defn get-selector
  "Description copied from interface: FieldSelector

  returns: `java.lang.String`"
  (^java.lang.String [^Dns$ProjectField this]
    (-> this (.getSelector))))

