(ns com.google.cloud.logging.SinkInfo$VersionFormat
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging SinkInfo$VersionFormat]))

(def V1
  "Enum Constant.

  type: com.google.cloud.logging.SinkInfo$VersionFormat"
  SinkInfo$VersionFormat/V1)

(def V2
  "Enum Constant.

  type: com.google.cloud.logging.SinkInfo$VersionFormat"
  SinkInfo$VersionFormat/V2)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (SinkInfo.VersionFormat c : SinkInfo.VersionFormat.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.logging.SinkInfo$VersionFormat[]`"
  ([]
    (SinkInfo$VersionFormat/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.logging.SinkInfo$VersionFormat`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.logging.SinkInfo$VersionFormat [^java.lang.String name]
    (SinkInfo$VersionFormat/valueOf name)))

