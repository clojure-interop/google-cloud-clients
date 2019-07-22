(ns com.google.cloud.compute.deprecated.Operation$Status
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Operation$Status]))

(def PENDING
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Operation$Status"
  Operation$Status/PENDING)

(def RUNNING
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Operation$Status"
  Operation$Status/RUNNING)

(def DONE
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Operation$Status"
  Operation$Status/DONE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Operation.Status c : Operation.Status.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.compute.deprecated.Operation$Status[]`"
  ([]
    (Operation$Status/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.compute.deprecated.Operation$Status`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.compute.deprecated.Operation$Status [^java.lang.String name]
    (Operation$Status/valueOf name)))

