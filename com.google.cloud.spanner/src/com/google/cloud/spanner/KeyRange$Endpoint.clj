(ns com.google.cloud.spanner.KeyRange$Endpoint
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner KeyRange$Endpoint]))

(def CLOSED
  "Enum Constant.

  Ranges include the endpoint key.

  type: com.google.cloud.spanner.KeyRange$Endpoint"
  KeyRange$Endpoint/CLOSED)

(def OPEN
  "Enum Constant.

  Ranges exclude the endpoint key.

  type: com.google.cloud.spanner.KeyRange$Endpoint"
  KeyRange$Endpoint/OPEN)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (KeyRange.Endpoint c : KeyRange.Endpoint.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.spanner.KeyRange$Endpoint[]`"
  ([]
    (KeyRange$Endpoint/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.spanner.KeyRange$Endpoint`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.spanner.KeyRange$Endpoint [^java.lang.String name]
    (KeyRange$Endpoint/valueOf name)))

