(ns com.google.cloud.spanner.DatabaseInfo$State
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner DatabaseInfo$State]))

(def UNSPECIFIED
  "Enum Constant.

  type: com.google.cloud.spanner.DatabaseInfo$State"
  DatabaseInfo$State/UNSPECIFIED)

(def CREATING
  "Enum Constant.

  type: com.google.cloud.spanner.DatabaseInfo$State"
  DatabaseInfo$State/CREATING)

(def READY
  "Enum Constant.

  type: com.google.cloud.spanner.DatabaseInfo$State"
  DatabaseInfo$State/READY)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (DatabaseInfo.State c : DatabaseInfo.State.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.spanner.DatabaseInfo$State[]`"
  ([]
    (DatabaseInfo$State/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.spanner.DatabaseInfo$State`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.spanner.DatabaseInfo$State [^java.lang.String name]
    (DatabaseInfo$State/valueOf name)))

