(ns com.google.cloud.logging.Payload$Type
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging Payload$Type]))

(def STRING
  "Enum Constant.

  Log entry data as UTF8 string.

  type: com.google.cloud.logging.Payload$Type"
  Payload$Type/STRING)

(def JSON
  "Enum Constant.

  Log entry data as JSON.

  type: com.google.cloud.logging.Payload$Type"
  Payload$Type/JSON)

(def PROTO
  "Enum Constant.

  Log entry data as a protobuf object.

  type: com.google.cloud.logging.Payload$Type"
  Payload$Type/PROTO)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Payload.Type c : Payload.Type.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.logging.Payload$Type[]`"
  ([]
    (Payload$Type/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.logging.Payload$Type`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.logging.Payload$Type [^java.lang.String name]
    (Payload$Type/valueOf name)))

